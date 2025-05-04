package org.mervenaz.builderDesign;

import java.util.List;

public class ApiResponse<T> {
    private final boolean success;
    private final String message;
    private final T data;
    private final List<String> errors;

    // Builder sınıfından gelen verilerle ApiResponse nesnesinin alanlarını dolduran constructor.
   // Dışarıdan doğrudan çağrılmaması için private olarak tanımlanmıştır.
    private ApiResponse(Builder<T> builder) {
        this.success = builder.success;
        this.message = builder.message;
        this.data = builder.data;
        this.errors = builder.errors;
    }
    // Getter metotları
    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public List<String> getErrors() {
        return errors;
    }

    public static class Builder<T> {
        //Builder sınıfı, ApiResponse sınıfındaki tüm alanları (örneğin success, message, data, errors) kendi içinde de tanımlar.
        // Böylece bu alanlara adım adım değer atamak ve en sonunda nesneyi oluşturmak mümkün hale gelir.
        private boolean success;
        private String message;
        private T data;
        private List<String> errors;

        // Zorunlu alanlar olan 'success' ve 'message' değerleri, Builder nesnesi oluşturulurken alınır.
        // Böylece bu alanların her zaman set edilmesi garanti altına alınmış olur.
        public Builder(boolean success, String message) {
            this.success = success;
            this.message = message;
        }

        // İsteğe bağlı alanları (opsiyonel) set etmek için kullanılan metotlardır.
       // Kullanıcı, ihtiyacına göre bu alanları tanımlayıp tanımlamamakta özgürdür.
        public Builder<T> data(T data) {
            this.data = data;
            return this;
        }

        // İsteğe bağlı errors listesini set eder.
        public Builder<T> errors(List<String> errors) {
            this.errors = errors;
            return this;
        }

        // Tüm parametreler set edildikten sonra, bu metot çağrılarak asıl ApiResponse nesnesi üretilir.
       // Böylece dış sınıfın constructor'ına doğrudan erişmeden, kontrollü bir şekilde nesne oluşturulmuş olur.
        public ApiResponse<T> build() {
            return new ApiResponse<>(this);
        }
    }

}
