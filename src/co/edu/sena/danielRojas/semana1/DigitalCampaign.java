public class DigitalCampaign {
    // Atributos
    String campaignCode;
    String platform;
    double budget;
    
    // Constructor
    public DigitalCampaign(String campaignCode, String platform, double budget) {
        this.campaignCode = campaignCode;
        this.platform = platform;
        this.budget = budget;
    }
    
    // Método para mostrar información
    public void showInfo() {
        System.out.println("=== INFORMACIÓN DE CAMPAÑA ===");
        System.out.println("Código: " + campaignCode);
        System.out.println("Plataforma: " + platform);
        System.out.println("Presupuesto: $" + budget);
        System.out.println("---------------------------");
    }
}


// ACTIVIDAD 4

public class Main {
    public static void main(String[] args) {
        // Crear 5 objetos de DigitalCampaign con datos reales
        DigitalCampaign campaña1 = new DigitalCampaign("CAMP-001", "Facebook Ads", 2500000);
        DigitalCampaign campaña2 = new DigitalCampaign("CAMP-002", "Google Ads", 3500000);
        DigitalCampaign campaña3 = new DigitalCampaign("CAMP-003", "Instagram Ads", 1800000);
        DigitalCampaign campaña4 = new DigitalCampaign("CAMP-004", "LinkedIn Ads", 4000000);
        DigitalCampaign campaña5 = new DigitalCampaign("CAMP-005", "TikTok Ads", 2000000);
        
        // Mostrar información de todas las campañas
        System.out.println("🎯 PORTFOLIO DE CAMPAÑAS - IMPACTO ONLINE");
        System.out.println("==========================================");
        System.out.println();
        
        campaña1.showInfo();
        campaña2.showInfo();
        campaña3.showInfo();
        campaña4.showInfo();
        campaña5.showInfo();
        
        // Mostrar resumen
        System.out.println("📊 RESUMEN:");
        System.out.println("Total campañas activas: 5");
        System.out.println("Plataformas utilizadas: Facebook, Google, Instagram, LinkedIn, TikTok");
    }
}