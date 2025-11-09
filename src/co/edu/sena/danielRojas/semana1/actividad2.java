// Programación Estructurada

String campaignCode1 = "CAMP-001";
String platform1 = "Facebook Ads";
double budget1 = 2500000;
String client1 = "Tienda XYZ";

// Funciones que trabajan con esas variables
void mostrarCampaña(String codigo, String plataforma, double presupuesto) {
    System.out.println("Código: " + codigo);
    System.out.println("Plataforma: " + plataforma);
    System.out.println("Presupuesto: $" + presupuesto);
}

// Para cada campaña nueva, necesito más variables
String campaignCode2 = "CAMP-002";
String platform2 = "Google Ads";
double budget2 = 3500000;



// Programacion Orientada a Objetos

public class DigitalCampaign {
    String campaignCode;
    String platform;
    double budget;
    String client;
    
    public DigitalCampaign(String code, String platform, double budget, String client) {
        this.campaignCode = code;
        this.platform = platform;
        this.budget = budget;
        this.client = client;
    }
    
    public void showInfo() {
        System.out.println("Código: " + campaignCode);
        System.out.println("Plataforma: " + platform);
        System.out.println("Presupuesto: $" + budget);
        System.out.println("Cliente: " + client);
    }
}

// Uso más organizado
DigitalCampaign campaña1 = new DigitalCampaign("CAMP-001", "Facebook Ads", 2500000, "Tienda XYZ");
DigitalCampaign campaña2 = new DigitalCampaign("CAMP-002", "Google Ads", 3500000, "Restaurante ABC");