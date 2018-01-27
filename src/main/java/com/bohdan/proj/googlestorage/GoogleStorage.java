package com.bohdan.proj.googlestorage;

import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

public class GoogleStorage {

    public static Storage getInstance(){
        return StorageOptions.getDefaultInstance().getService();
    }
}
