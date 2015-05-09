package com.mac.voiceprocesing.webService;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.5
//
// Date Of Creation: 2/22/2015 6:07:17 AM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import java.util.Vector;
import android.util.Base64;

public class VectorByte extends Vector<Byte> implements KvmSerializable {
    @Override
    public String getInnerText() {
        return null;
    }

    @Override
    public void setInnerText(String s) {

    }

    public VectorByte(){}
    
    public VectorByte(SoapPrimitive soapPrimitive) {
        if (soapPrimitive != null) {
            String result = soapPrimitive.toString();
            if (result != "") {
                byte[] bytes = Base64.decode(result, Base64.DEFAULT);
                for (final byte b : bytes) {
                    add(b);
                }
            }
        }
    }
    public VectorByte(byte[] bytes){
        for (byte b : bytes) {
            add(b);
        }
    }
    @Override
    public Object getProperty(int arg0) {
        return this.get(arg0);
    }
    
    @Override
    public int getPropertyCount() {
        return this.size();
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        info.name = "byte";
        info.type = Byte.class;
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
    @Override
    public String toString() {
        byte[] byteToString = toBytes();
        return Base64.encodeToString(byteToString, Base64.DEFAULT);
    }
    public byte[] toBytes(){
        byte[] bytes = new byte[this.size()];
        int i = 0;
        for (Byte b : this) {
            bytes[i++] = b;
        }
        return bytes;
    }
}
