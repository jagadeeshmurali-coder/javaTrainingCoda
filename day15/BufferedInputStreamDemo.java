package day15;

import java.io.*;
class BufferedInputStreamDemo{
	public static void main(String arg[]) throws IOException {
		String s="99% is  &approx; equal to 100   but this is &approx not.";
		byte buf[]=s.getBytes();
		ByteArrayInputStream in=new ByteArrayInputStream(buf);
		BufferedInputStream f=new BufferedInputStream(in);
		int c;

char a=247;
boolean marked=false;
while((c=f.read())!=-1){
	switch(c){
	   case '&':
		   if(!marked){
			   f.mark(32);
			   marked=true;
			   } else {
				   marked=false;
				   } 
		   break;
	   case ';':
		   if (marked){
			   marked=false;
			   System.out.print(a);
			   }else {
				   System.out.print((char)c);
				   } break;
	   case ' ':
		   if(marked){
			   marked=false;
			   f.reset();System.out.print("&");
			   } else 
				   System.out.print((char) c);
			   }
		   }
	}
}

