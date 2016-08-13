package com.geeklib.util;

import java.lang.reflect.Field;

public class StringPrinter
{
	public String toString()
	{
		StringBuffer buffer = new StringBuffer();
		Class clazz = this.getClass();
		Field[] fields = clazz.getDeclaredFields();
		
		Field.setAccessible(fields, true);
		
		for (Field field : fields)
		{
			try
			{
				System.out.println(field.getType().toGenericString());
				buffer.append(field.getName() + "=" + field.get(this) + ",");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return buffer.toString();
	}
}
