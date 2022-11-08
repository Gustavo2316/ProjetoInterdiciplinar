package smartphone;

import java.util.UUID;

public class SmartPhoneService {

    public void testeConectividade(boolean conectividade) {

        verify();

        if (conectividade == true) {
            System.out.println("[Smartphone possui conexão 5G]");
        } else {
            System.out.println("[ERRO: Conexão incompatível com seu dispositivo]");
        }
    }

    private void verify() {
        try {
            Thread.sleep(1500);
            System.out.println("[Verificando Conexão]");
            Thread.sleep(400);
            System.out.println("Testando upload..");
            ratioTest();
            System.out.print("Testando download.");
            for (int i = 0; i < 15; i++) {
                System.out.print(".");
                Thread.sleep(800);
            }
            System.out.println("\n");
            charging();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    private void ratioTest() {
        try {
            String cellID = UUID.randomUUID().toString();
            String[] ratio = { " PLMN ", " Band Info ", " Bandwidth ", " Radio Access ", " Deployment Type ", " PCI ",
                    " TAC " };
            for (int i = 0; i < ratio.length; i++) {
                System.out.println(ratio[i]);
                Thread.sleep(600);
            }
            Thread.sleep(1200);
            System.out.print("Gerando CellID.");
            for (int i = 0; i < 15; i++) {
                System.out.print(".");
                Thread.sleep(600);
            }
            Thread.sleep(2000);
            System.out.println("\nCellID: " + cellID);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    private void charging() {
        try {
            System.out.print("Carregando as informações, aguarde.");
            for (int i = 0; i < 10; i++) {
                System.out.print(".");
                Thread.sleep(600);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
