
package com.Practica3.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "practica3-db377.firebaseapp.com";

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "practica3";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "practica3-db377-firebase-adminsdk-wyv26-7d62330ef6.json";
}

