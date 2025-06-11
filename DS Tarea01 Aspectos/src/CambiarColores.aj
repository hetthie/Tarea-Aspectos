import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

public aspect CambiarColores {

    after(): execution(void Ventana.crearBotones(..)) {
        System.out.println("Aspecto ejecutado: conectando listeners");

        Ventana.button1.addListener(SWT.Selection, new Listener() {

            public void handleEvent(Event e) {
                Ventana.shell.setBackground(new Color(Ventana.shell.getDisplay(), 255, 0, 0));
                Ventana.colorLabel.setText("Rojo");
            }
        });

        Ventana.button2.addListener(SWT.Selection, new Listener() {

            public void handleEvent(Event e) {
                Ventana.shell.setBackground(new Color(Ventana.shell.getDisplay(), 0, 255, 0));
                Ventana.colorLabel.setText("Verde");
            }
        });

        Ventana.button3.addListener(SWT.Selection, new Listener() {

            public void handleEvent(Event e) {
                Ventana.shell.setBackground(new Color(Ventana.shell.getDisplay(), 0, 0, 255));
                Ventana.colorLabel.setText("Azul");
            }
        });
    }
}

	        
