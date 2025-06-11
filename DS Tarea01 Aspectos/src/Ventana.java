import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

public class Ventana {
    public static Button button1, button2, button3;
    public static Shell shell;
    public static Label colorLabel;

    public static void main(String[] args) {
        Display display = new Display();
        shell = new Shell(display);
        shell.setSize(300, 200);
        shell.setText("Ventana con AspectJ");
        shell.setLayout(null);

        // Creamos los botones
        crearBotones();

        shell.open();

        // Bucle de eventos
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }

        display.dispose();
    }

    public static void crearBotones() {
        button1 = new Button(shell, SWT.PUSH);
        button1.setText("Rojo");
        button1.setBounds(30, 50, 80, 30);

        button2 = new Button(shell, SWT.PUSH);
        button2.setText("Verde");
        button2.setBounds(110, 50, 80, 30);

        button3 = new Button(shell, SWT.PUSH);
        button3.setText("Azul");
        button3.setBounds(190, 50, 80, 30);
        
        colorLabel = new Label(shell, SWT.CENTER); 
        colorLabel.setBounds(100, 100, 100, 30);
        colorLabel.setText("Sin color");
        
    }
}

