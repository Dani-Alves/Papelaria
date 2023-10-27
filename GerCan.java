//Daniela dos Santos Alves 2465728

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerCan {

    private Caneta can;
    private List<Caneta> bdCan = new ArrayList<Caneta>();

    public List<Caneta> getBdCan() {
        return bdCan;
    }

    public Caneta cadCan(Caneta can) {
        if (consCanCod(can) == null) {
            bdCan.add(can);
            return can;
        } else {
            return null;
        }

    }

    public Caneta consCanCod(Caneta can) {
        for (int i = 0; i < bdCan.size(); i++) {
            if (can.getCodProduto() == bdCan.get(i).getCodProduto()) {
                return bdCan.get(i);
            }
        }
        return null;
    }

    public Caneta atualizaCaneta(Caneta can) {
        for (int i = 0; i < bdCan.size(); i++) {
            if (can.getCodProduto() == bdCan.get(i).getCodProduto()) {
                String p = JOptionPane.showInputDialog(null, "Informe o NOVO preco", "Atualização", JOptionPane.QUESTION_MESSAGE);
                float preco = Float.parseFloat(p);
                can.setPreco(preco);
                bdCan.set(i, can);
                //return bdCan.get(i);
                String marca = JOptionPane.showInputDialog(null, "Informe A NOVA marca", "Atualização", JOptionPane.QUESTION_MESSAGE);
                can.setMarca(marca);
                bdCan.set(i, can);
                //return bdCan.get(i);
                String cor = JOptionPane.showInputDialog(null, "Informe a NOVA cor", "Atualização", JOptionPane.QUESTION_MESSAGE);
                can.setCorTinta(cor);
                bdCan.set(i, can);
                //return bdCan.get(i);
                String tc = JOptionPane.showInputDialog(null, "Informe o NOVO tipo de caneta", "Atualização", JOptionPane.QUESTION_MESSAGE);
                int tipo = Integer.parseInt(tc);
                can.setTipoCaneta(tipo);
                bdCan.set(i, can);
                //return bdCan.get(i);
                String tam = JOptionPane.showInputDialog(null, "Informe o NOVO tamanho", "Atualização", JOptionPane.QUESTION_MESSAGE);
                int tamanho = Integer.parseInt(tam);
                can.setTamPonta(tamanho);
                bdCan.set(i, can);
                return bdCan.get(i);
            }
        }
        return null;
    }

    public Caneta deletaCaneta(Caneta can) {
        can = consCanCod(can);
        if (can != null) {
            bdCan.remove(can);
            return null;
        } else {
            return can;
        }

    }

}
