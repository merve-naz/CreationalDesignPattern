package org.mervenaz.builderDesign;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Başarılı bir yanıt örneği
        ApiResponse<String> successResponse = new ApiResponse.Builder<String>(true, "İşlem başarılı")
                .data("Kullanıcı bilgisi")
                .build();

        System.out.println("Başarılı yanıt:");
        System.out.println("Success: " + successResponse.isSuccess());
        System.out.println("Message: " + successResponse.getMessage());
        System.out.println("Data: " + successResponse.getData());

        // Hatalı bir yanıt örneği
        ApiResponse<Void> errorResponse = new ApiResponse.Builder<Void>(false, "Hatalı istek")
                .errors(List.of("Email alanı zorunludur", "Şifre en az 8 karakter olmalıdır"))
                .build();

        System.out.println("\nHatalı yanıt:");
        System.out.println("Success: " + errorResponse.isSuccess());
        System.out.println("Message: " + errorResponse.getMessage());
        System.out.println("Errors: " + errorResponse.getErrors());
    }
}
