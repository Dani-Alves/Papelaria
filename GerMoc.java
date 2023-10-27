//Daniela dos Santos Alves 2465728

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerMoc {

    private Mochila moc;
    private List<Mochila> bdMoc = new ArrayList<Mochila>();

    public List<Mochila> getBdMoc() {
        return bdMoc;
    }

    public Mochila cadMoc(Mochila moc) {
        if (consMocCod(moc) == null) {
            bdMoc.add(moc);
            return moc;
        } else {
            return null;
        }
    }

    public Mochila consMocCod(Mochila moc) {
        for (int i = 0; i < bdMoc.size(); i++) {
            if (moc.getCodProduto() == bdMoc.get(i).getCodProduto()) {
                return bdMoc.get(i);
            }
        }
        return null;
    }

    public Mochila atualizaMochila(Mochila moc) {
        for (int i = 0; i < bdMoc.size(); i++) {
            if (moc.getCodProduto() == bdMoc.get(i).getCodProduto()) {
                String p = JOptionPane.showInputDialog(null, "Informe o NOVO preco", "Atualização", JOptionPane.QUESTION_MESSAGE);
                float preco = Float.parseFloat(p);
                moc.setPreco(preco);
                bdMoc.set(i, moc);
                String marca = JOptionPane.showInputDialog(null, "Informe A NOVA marca", "Atualização", JOptionPane.QUESTION_MESSAGE);
                moc.setMarca(marca);
                bdMoc.set(i, moc);
                String c = JOptionPane.showInputDialog(null, "Informe o NOVA cor", "Atualização", JOptionPane.QUESTION_MESSAGE);
                moc.setCor(c);
                bdMoc.set(i, moc);
                String tam = JOptionPane.showInputDialog(null, "Informe o NOVO tamanho", "Atualização", JOptionPane.QUESTION_MESSAGE);
                int t = Integer.parseInt(tam);
                moc.setTamanho(t);
                bdMoc.set(i, moc);
                String faixa = JOptionPane.showInputDialog(null, "Informe a NOVA faixa etaria", "Atualização", JOptionPane.QUESTION_MESSAGE);
                int f = Integer.parseInt(faixa);
                moc.setFaixaEtaria(f);
                bdMoc.set(i, moc);
                String sm = JOptionPane.showInputDialog(null, "Informe o NOVo sexo", "Atualização", JOptionPane.QUESTION_MESSAGE);
                int s = Integer.parseInt(sm);
                moc.setSexo(s);
                bdMoc.set(i, moc);
            }
        }
        return null;
    }

    public Mochila deletaMochila(Mochila moc) {
        moc = consMocCod(moc);
        if (moc != null) {
            bdMoc.remove(moc);
            return null;
        } else {
            return moc;
        }
    }

}
