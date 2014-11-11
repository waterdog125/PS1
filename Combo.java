import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;


public class Combo {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Combo window = new Combo();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		org.eclipse.swt.widgets.Combo combo = new org.eclipse.swt.widgets.Combo(shell, SWT.NONE);
		combo.setItems(new String[] {"January", "February", "March", "April", "May", "June", "July", "Augest", "September","October", "November", "December" });
		combo.setBounds(231, 56, 91, 23);
		combo.setText("November");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(110, 56, 55, 15);
		lblNewLabel.setText("Month");
		
		org.eclipse.swt.widgets.Combo combo_1 = new org.eclipse.swt.widgets.Combo(shell, SWT.NONE);
		combo_1.setItems(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"});
		combo_1.setBounds(231, 113, 91, 23);
		combo_1.setText("2");
		
		org.eclipse.swt.widgets.Combo combo_2 = new org.eclipse.swt.widgets.Combo(shell, SWT.NONE);
		combo_2.setItems(new String[] {"2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"});
		combo_2.setBounds(231, 181, 91, 23);
		combo_2.setText("2014");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(110, 113, 55, 15);
		lblNewLabel_1.setText("Day");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(110, 181, 55, 15);
		lblNewLabel_2.setText("Year");
		
	
		
		
		
		
	
	}
}
