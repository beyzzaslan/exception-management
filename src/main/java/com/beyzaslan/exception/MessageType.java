package com.beyzaslan.exception;

import lombok.Getter;

@Getter
public enum MessageType {

    NO_RECORD_EXIST("1001", "kayıt bulunamadı"),
    GENERAL_EXCEPTİON("9999","GENEL BİR HATA OLUŞTU");

    private final String code;
    private final String message;

    MessageType(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
