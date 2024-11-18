package GUI;

import javax.swing.JOptionPane;

public class DialogAlert {
    
    String campo = "";
    
    public DialogAlert(String campo){
        this.campo = campo;
    };
    
    public void showAlert(int resultCode){
        // 1. CONFIGURAR mensajes en pantalla.
        String message = "";
        int typeMessage = 0;
        
        switch (resultCode) {
            case 200:
                message = "Éxito al realizar la operación. (OK)";
                typeMessage = JOptionPane.INFORMATION_MESSAGE;
                break;
            case 202:
                message = "Éxito al crear: " + campo;
                typeMessage = JOptionPane.INFORMATION_MESSAGE;
                break;
            case 500:
                message = "Error al crear: " + campo;
                typeMessage = JOptionPane.WARNING_MESSAGE;
                break;
            default:
                break;
        }
        
        // 2. MOSTRAR los mensajes en pantalla.
        JOptionPane.showMessageDialog(null, message, campo, typeMessage);
    }
    
      public void showAlert(int resultCode, Exception err){
        // 1. CONFIGURAR mensajes en pantalla.
        String message = "";
        int typeMessage = 0;
        
        switch (resultCode) {
            case 400:
                message = "Error al realizar consulta.";
                typeMessage = JOptionPane.WARNING_MESSAGE;
                break;
            case 500:
                message = "Error al crear: " + campo;
                typeMessage = JOptionPane.ERROR_MESSAGE;
                break;
            default:
                break;
        }
        
        message += "\nERROR: " + err.getMessage();
        
        // 2. MOSTRAR los mensajes en pantalla.
        JOptionPane.showMessageDialog(null, message, campo, typeMessage);
    }
    
    public void genericDialog(String message, int type){
        JOptionPane.showMessageDialog(null, message, "Mensaje de " + campo.toUpperCase(), type);
    }
    
    public static void genericDialog(String content, String title, int type){
        JOptionPane.showMessageDialog(null, content, title, type);
    }
}
