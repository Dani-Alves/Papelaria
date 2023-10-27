//Daniela dos Santos Alves 2465728

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerCad {

    private Caderno cad;
    private List<Caderno> bdCad = new ArrayList<Caderno>();

    public List<Caderno> getBdCad() {
        return bdCad;
    }

    public Caderno cadCad(Caderno cad) {
        Caderno cadExiste = consultaCaderno(cad);
        if (cadExiste == null) {
            bdCad.add(cad);
            return cad;
        } else {
            return null;
        }

    }

    public Caderno consultaCaderno(Caderno cad) {
        for (int i = 0; i < bdCad.size(); i++) {
            if (cad.getCodProduto() == bdCad.get(i).getCodProduto()) {
                return bdCad.get(i);
            }
        }
        return null;
    }

    public Caderno deletaCaderno(Caderno cad) {
        cad = consultaCaderno(cad);
        if (cad != null) {
            bdCad.remove(cad);
            return null;
        } else {
            return cad;
        }

    }

    public Caderno atualizaCaderno(Caderno cad) {
        for (int i = 0; i < bdCad.size(); i++) {
            if (cad.getCodProduto() == bdCad.get(i).getCodProduto()) {
                String p = JOptionPane.showInputDialog(null, "Informe o NOVO preco", "Atualização", JOptionPane.QUESTION_MESSAGE);
                float preco = Float.parseFloat(p);
                cad.setPreco(preco);
                bdCad.set(i, cad);
                String marca = JOptionPane.showInputDialog(null, "Informe A NOVA marca", "Atualização", JOptionPane.QUESTION_MESSAGE);
                cad.setMarca(marca);
                bdCad.set(i, cad);
                String tf = JOptionPane.showInputDialog(null, "Informe o NOVO tipo de caneta", "Atualização", JOptionPane.QUESTION_MESSAGE);
                int tipo = Integer.parseInt(tf);
                cad.setTipoFolha(tipo);
                bdCad.set(i, cad);
                String qf = JOptionPane.showInputDialog(null, "Informe o NOVO tamanho", "Atualização", JOptionPane.QUESTION_MESSAGE);
                int qtd = Integer.parseInt(qf);
                cad.setQtdFolhas(qtd);
                bdCad.set(i, cad);
                return bdCad.get(i);
            }
        }
        return null;
    }

}
