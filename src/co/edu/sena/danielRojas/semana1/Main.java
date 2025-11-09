public class Main {
    public static void main(String[] args) {
        // Crear 3 objetos diferentes de DigitalCampaign
        DigitalCampaign campaña1 = new DigitalCampaign("CAMP-001", "Facebook Ads", 2500000);
        DigitalCampaign campaña2 = new DigitalCampaign("CAMP-002", "Instagram Ads", 1800000);
        DigitalCampaign campaña3 = new DigitalCampaign("CAMP-003", "Google Ads", 3500000);
        
        // Mostrar información de cada campaña
        System.out.println("Campañas de Impacto Online:");
        System.out.println();
        
        campaña1.showInfo();
        campaña2.showInfo();
        campaña3.showInfo();
    }
}