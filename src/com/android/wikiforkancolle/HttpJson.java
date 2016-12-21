package com.android.wikiforkancolle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;  
import java.util.List; 
 






import org.json.JSONArray; 
import org.json.JSONException; 
import org.json.JSONObject; 

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;


public class HttpJson {
    
	private String url;
	private int code;
	private Context context;
	private List<Ship> ships=new ArrayList<Ship>();
    static JSONObject jOb=null;
    static InputStream in=null;
    static String json="";
    static String a="";
    
    public HttpJson(String url){
    	this.url=url;
    }
    
	
	public List<Ship> parseJson() {
		
			URL httpUrl;
			try {	
				
				httpUrl = new URL(url);
				HttpURLConnection conn = (HttpURLConnection) httpUrl.openConnection();
				conn.setReadTimeout(5000);
				conn.setRequestMethod("GET");	
				this.code=conn.getResponseCode();
				if(this.code==200){
				in = conn.getInputStream();
			    BufferedReader reader=new BufferedReader(new InputStreamReader(in));
				StringBuffer sb=new StringBuffer();
				String str;
				
				while((str=reader.readLine())!=null){
					sb.append(str);
				}
				
				in.close();
				
				json=sb.toString();
				jOb=new JSONObject(json);
				

					int code2=jOb.getInt("code");
					//String message=object.getString("message");
					
					
					if(code2==200){
						JSONArray datas=jOb.getJSONArray("data");

						for(int i=0;i<datas.length();i++){
							JSONObject data=datas.getJSONObject(i);

			                int id=data.getInt("id");
			                String shipUrl=data.getString("url");
			                	
			                Ship shipdata=new Ship();
			                shipdata.setId(id);
			                shipdata.setURL(shipUrl);
			                	
			                ships.add(shipdata);  
						}
						
						
						
					}else{
						Toast.makeText(context, "error", 1).show();
					}
					
				}else{
					a=""+this.code;
				}
				
				
				
			 } catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 } catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return ships;
			
	}
	
}
	
