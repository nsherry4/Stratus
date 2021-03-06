package stratus.controls;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.border.EmptyBorder;

public class ButtonLinker extends JComponent {

	private GridBagConstraints c = new GridBagConstraints();
	
	public ButtonLinker(AbstractButton... buttons) {
		setLayout(new GridBagLayout());
		setOpaque(false);
		c.fill = GridBagConstraints.NONE;
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0;
		c.gridy = 0;
		for (AbstractButton button : buttons) {
			addButton(button);
		}
	}
	
	public void addButton(AbstractButton button) {
		add(button, c);
		c.gridx++;
	}
	
	public String getUIClassID() {
		return "StratusButtonLinkerUI";
	}
	
}
