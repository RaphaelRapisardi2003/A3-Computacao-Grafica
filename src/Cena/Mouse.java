package Cena;

import com.jogamp.newt.event.MouseEvent;
import com.jogamp.newt.event.MouseListener;

public class Mouse implements MouseListener {

    // atributos
    private Cena cena;

    public Mouse(Cena cena) {
        this.cena = cena;
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if (cena.mouseHabilitado) {
        cena.mouseX = (float)((e.getX()/5)-100);
        cena.mouseY = (float)((e.getY()/5)-100)*-1;

            if(!cena.jogador.isPausado()){
                //mouse pra direita
                if ((float)((e.getX()/5)-100) > cena.jogador.getObjSprite().getIntervaloDireita()[0][0]) {
                    cena.jogador.getObjSprite().setMovendo(true);
                    cena.jogador.getObjSprite().setDirecao(Direcao.DIREITA);
                }
                // mouse pra esquerda
                if ((float)((e.getX()/5)-100) < cena.jogador.getObjSprite().getIntervaloEsquerda()[0][1]) {
                    cena.jogador.getObjSprite().setMovendo(true);
                    cena.jogador.getObjSprite().setDirecao(Direcao.ESQUERDA);
                }
                // mouse em cima da barra
                if ((float)((e.getX()/5)-100) >= cena.jogador.getObjSprite().getIntervaloDireita()[0][0] &&
                        e.getX() <= cena.jogador.getObjSprite().getIntervaloEsquerda()[0][1]) {
                    cena.jogador.getObjSprite().setMovendo(false);
                }
            }


        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseWheelMoved(MouseEvent e) {

    }
}
