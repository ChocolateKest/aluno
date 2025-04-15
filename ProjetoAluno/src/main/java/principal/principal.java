package principal;

import javax.swing.JOptionPane;
import model.Aluno;
public class principal {
    
    public static void main (String[] args){
        Aluno mp = new Aluno();
        
        mp.setAluno(JOptionPane.showInputDialog("Digite o nome do aluno:"));
        
        mp.setNota1(Double.parseDouble(JOptionPane.
                showInputDialog("Digite a primeira nota: ")));
        mp.setNota2(Double.parseDouble(JOptionPane.
                showInputDialog("Digite a segunda nota: ")));
        mp.setNota3(Double.parseDouble(JOptionPane.
                showInputDialog("Digite a terceira nota: ")));
        
        JOptionPane.showMessageDialog(null,"A média do " + mp.getAluno() + " é " + mp.getMedia());
        
        
        
        
        
        
        
        
        
    }
    
}
