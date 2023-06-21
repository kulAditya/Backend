package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entities.Category;
import com.example.demo.entities.Login;
import com.example.demo.entities.ProcuctSave;
import com.example.demo.entities.Product;
import com.example.demo.services.CategoryService;
import com.example.demo.services.LoginService;
import com.example.demo.services.ProductService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class ProductController {

	@Autowired
	ProductService proserv;
	
	@Autowired
	CategoryService cservice;
	
	Category cid;
	
	
	@Autowired
	LoginService lservice;
	
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProduct()
	{
		return proserv.getAllProducts();
	}
	
	@GetMapping("/getallProductbylogin")
	public List<Product> getBySeller(@RequestParam("emailid") String emailid,@RequestParam("password") String pwd)
	{
		Login l=lservice.getLogin(emailid, pwd);
		List<Product> lpd=proserv.getByLogin(l);
		
		return lpd;
	}
	
	@GetMapping("/getProduct")
	public Product getProduct(@RequestParam("loginid")int loginid)
	{
		
		Login l=lservice.getById(loginid);
	//	Product p=proserv.getProduct(l);
		return proserv.getProduct(l);
		
	}
	
	@PostMapping("/saveproduct")
	public Product saveProduct(@RequestBody ProcuctSave prs)
	{
			System.out.println(prs);
			Category c=cservice.getCategory(prs.getCid());
			
			System.out.println(c);
			
				//	Category cat=new Category();
			int loginid=proserv.getLoginidBylogin(prs.getEmailid(), prs.getPwd());
			
			System.out.println(prs.getEmailid()+prs.getPwd());
			Login l=lservice.getById(loginid);
		//	Login l=lservice.getLogin(emailid, pwd);
			System.out.println(l);
		
		Product p= new Product(prs.getProductname(),prs.getVideo(),prs.getPrice(),c,l);
			
			System.out.println("product"+p);
		  return proserv.saveProduct(p);
	}
	
	@PostMapping(value="/uploadImage/{pid}",consumes="multipart/form-data")
	public boolean UploadImage(@PathVariable("pid") int pid,@RequestBody MultipartFile file )
	{
		
		
		System.out.println("hello");
		boolean flag=true;
		try {
			flag=proserv.UploadImage(pid, file.getBytes());
			
		}
		catch (Exception e)
		{
			flag=false;
		}
		
		
		return flag;
		
	}
	
	
	@DeleteMapping("/deleteproduct")
	public boolean RemoveProduct(@RequestParam("pid") int pid)
	{
		proserv.RemoveProduct(pid);
		
		return true;
	}
	
	@GetMapping("/getloginidbylogin")
	public int getLoginidBylogin(@RequestParam("emailid") String emailid,@RequestParam("password") String pwd)
	{
		//Login l=lservice.getLogin(emailid, pwd);
		int loginid=proserv.getLoginidBylogin(emailid, pwd);
		return loginid;
	}
	
	
	
}
