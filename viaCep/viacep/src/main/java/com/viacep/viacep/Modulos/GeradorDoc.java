package com.viacep.viacep.Modulos;


import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GeradorDoc {
    
    public void GeradorDocumento(Cep cep) throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        FileWriter doc = new FileWriter(cep.cep() + ".json");
        doc.write(gson.toJson(cep)); //
        doc.close();
    }

}
