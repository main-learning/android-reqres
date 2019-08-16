package com.example.reqres;

import com.google.gson.annotations.SerializedName;

public class LoginResponse{

	@SerializedName("id")
	private int id;

	@SerializedName("token")
	private String token;

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setToken(String token){
		this.token = token;
	}

	public String getToken(){
		return token;
	}

	@Override
 	public String toString(){
		return 
			"LoginResponse{" + 
			"id = '" + id + '\'' + 
			",token = '" + token + '\'' + 
			"}";
		}
}