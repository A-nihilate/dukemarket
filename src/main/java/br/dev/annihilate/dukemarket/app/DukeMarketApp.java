/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.annihilate.dukemarket.app;

import br.dev.annihilate.dukemarket.bean.Produto;
import br.dev.annihilate.dukemarket.dao.ProdutoDAO;

/**
 *
 * @author sesi2dia
 */
public class DukeMarketApp {
 
    public static void main(String[] args) {
        Produto pAux;
        ProdutoDAO pDAO = new ProdutoDAO();
        
//        pAux = new Produto();
//        pAux.setCodBarras("11111111");
//        pAux.setDescriacao("Mouse Logitech Bluetooth");
//        pAux.setQtd(50);
//        pAux.setValorCompra(80.00);
//        pAux.setValorVenda(167.00);
//        
//        pDAO.create(pAux);
//        
//        pAux = new Produto();
//        pAux.setCodBarras("22222222");
//        pAux.setDescriacao("Teclado USB Gamer");
//        pAux.setQtd(80);
//        pAux.setValorCompra(104.00);
//        pAux.setValorVenda(220.00);
//        
//        pDAO.create(pAux);
//        
//        pAux = new Produto();
//        pAux.setCodBarras("33333333");
//        pAux.setDescriacao("Microcomputador Dell");
//        pAux.setQtd(110);
//        pAux.setValorCompra(2400.00);
//        pAux.setValorVenda(3200.00);
//        
//        pDAO.create(pAux);
        
//        pDAO.delete(3); //it deleted the second one, because it had ID 3, at the first try, i did a ops and added one wrong, after the fix (i dont even know how the first one passed through) i deleted that one, but the "auto increment" still incremented when i added more. in another words, i did ops, added 1 wrong, deleted the 1 wrong and now the second got +1 in the ID

//    pAux = pDAO.getResultById(2); //same reason
//    pAux.setQtd(100);
//    pDAO.update(pAux);


//        list
        
        pDAO.getResults().forEach(p -> {
            System.out.println(p.toString());
        });
        
    }
}
