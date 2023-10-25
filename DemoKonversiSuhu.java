class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 konversiSuhu2 = new KonversiSuhu2();

        double celsiusValue = 47.0;
        double fahrenheitValue = konversiSuhu2.celciusToFahrenheit(celsiusValue);
        double reamurValue = konversiSuhu2.celciusToReamur(celsiusValue);
        double reamurFromFahrenheit = konversiSuhu2.fahrenheitToReamur(fahrenheitValue);

        System.out.println("100 Celsius ke Fahrenheit: " + fahrenheitValue);
        System.out.println("100 Celsius ke Reamur: " + reamurValue);
        System.out.println("Hasil Reamur dari Fahrenheit: " + reamurFromFahrenheit);
    }
}