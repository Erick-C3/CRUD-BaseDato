/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import controlador.JugadorDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelos.Jugador;

/**
 *
 * @author Katsuo
 */
public class Aplicacion extends javax.swing.JFrame {
    
    private JugadorDAO controladorJugador;
    
    
    private static final String[] SIN_VECTOR_PARA_VENTANA = null;
    private static final String VALOR_INICIAL_RECIBIR_VENTANA = "";
    
    private static final String MENSAJE_VENTANA_INGRESAR = "Ingreso exitoso!";
    private static final String TITULO_VENTANA_INGRESAR = "Confirmacion de ingreso";
    private static final ImageIcon ICONO_INGRESAR = new ImageIcon("./src/imagenes/insertarIcono.png");
    
    private static final String MENSAJE_VENTANA_OBTENER = "Ingrese nombre de jugador a buscar";
    private static final String TITULO_VENTANA_OBTENER = "Buscando jugador";
    private static final ImageIcon ICONO_OBTENER = new ImageIcon("./src/imagenes/obtenerIcono.png");
    
    
    private static final String MENSAJE_VENTANA_ACTUALIZAR = "Ingrese nombre de jugador a actualizar";
    private static final String TITULO_VENTANA_ACTUALIZAR = "Actualizando la base de dato";
    private static final ImageIcon ICONO_ACTUALIZAR = new ImageIcon("./src/imagenes/actualizarIcono.png");
    
    
    private static final String MENSAJE_VENTANA_ELIMINAR = "Ingrese nombre de jugador a eliminar";
    private static final String TITULO_VENTANA_ELIMINAR = "Eliminando jugador de la base de dato";
    private static final ImageIcon ICONO_ELIMINAR = new ImageIcon("./src/imagenes/eliminarIcono.png");
    
    
    
    /**
     * Creates new form Aplicacion
     */
    public Aplicacion() {
        initComponents();
        controladorJugador = new JugadorDAO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonObtener = new javax.swing.JButton();
        jButtonInsertar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEmpates = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldVictorias = new javax.swing.JTextField();
        jTextFieldDerrotas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonObtener.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButtonObtener.setText("Obtener");
        jButtonObtener.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonObtenerMouseClicked(evt);
            }
        });

        jButtonInsertar.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButtonInsertar.setText("Insertar");
        jButtonInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonInsertarMouseClicked(evt);
            }
        });

        jButtonEliminar.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEliminarMouseClicked(evt);
            }
        });

        jButtonActualizar.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonActualizarMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Victorias");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Derrotas");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Empates");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Nombre");

        jTextFieldEmpates.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jTextFieldEmpates.setText("0");

        jTextFieldNombre.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jTextFieldNombre.setText("Nombre jugador");

        jTextFieldVictorias.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jTextFieldVictorias.setText("0");

        jTextFieldDerrotas.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jTextFieldDerrotas.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButtonInsertar)
                        .addGap(46, 46, 46)
                        .addComponent(jButtonObtener)
                        .addGap(65, 65, 65)
                        .addComponent(jButtonActualizar)
                        .addGap(100, 100, 100)
                        .addComponent(jButtonEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldVictorias, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldDerrotas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(127, 127, 127)
                                .addComponent(jLabel6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jTextFieldEmpates, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(342, Short.MAX_VALUE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(289, 289, 289)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel8)
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmpates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldVictorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDerrotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonObtener)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonInsertar)
                    .addComponent(jButtonActualizar))
                .addGap(65, 65, 65))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(422, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    private void jButtonInsertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInsertarMouseClicked
        /*Jugador nuevoJugador =  new Jugador(
                        jTextFieldNombre.getText(),
                        Integer.parseInt(jTextFieldVictorias.getText()),
                        Integer.parseInt(jTextFieldDerrotas.getText()),
                        Integer.parseInt(jTextFieldEmpates.getText())                     
                );
        */
        controladorJugador.insertarJugador(obtenerJugadorDeAplicacion());
        
        mostrarVentanaIngreso();
    }//GEN-LAST:event_jButtonInsertarMouseClicked

    
    
    
    private void jButtonObtenerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonObtenerMouseClicked
        
        Jugador jugadorEncontrado = controladorJugador.obtenerJugador( mostrarVentanaObtener());
        
        //actualizar la informacion visual en la aplicacion con el jugador obtenido en la base de dato
        jTextFieldNombre.setText( jugadorEncontrado.comoTeLlamas());
        jTextFieldVictorias.setText( String.valueOf(jugadorEncontrado.cuantasCopasTenes()));
        jTextFieldDerrotas.setText(String.valueOf(jugadorEncontrado.cuantasDerrotasTenes()));
        jTextFieldEmpates.setText(String.valueOf(jugadorEncontrado.cuantosEmpatesTenes()));
        
    }//GEN-LAST:event_jButtonObtenerMouseClicked

    
    
    private void jButtonActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonActualizarMouseClicked
        controladorJugador.actualizarJugador(
                obtenerJugadorDeAplicacion(),
                mostrarVentanaActualizar()
        );
    }//GEN-LAST:event_jButtonActualizarMouseClicked

    private void jButtonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEliminarMouseClicked
        controladorJugador.darBajaJugador(new Jugador( mostrarVentanaEliminar() ));
    }//GEN-LAST:event_jButtonEliminarMouseClicked

    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JButton jButtonObtener;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextFieldDerrotas;
    private javax.swing.JTextField jTextFieldEmpates;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldVictorias;
    // End of variables declaration//GEN-END:variables

    /**
     * Devuelve la informacion del jugador actual en la aplicacion
     * @return el jugador actual en la aplicacion
     */
    private Jugador obtenerJugadorDeAplicacion() {
        return (
                    new Jugador(
                            jTextFieldNombre.getText(),
                            Integer.parseInt(jTextFieldVictorias.getText()),
                            Integer.parseInt(jTextFieldDerrotas.getText()),
                            Integer.parseInt(jTextFieldEmpates.getText())                     
                    )
               );
    }
    
    /**
     * Muestra la ventana para recibir un numbre a buscar en la base de datos
     * @return el nombre del jugador solicitado a buscar
     */
    private String mostrarVentanaObtener() {        
        return mostrarVentanaParaObtenerNombre(MENSAJE_VENTANA_OBTENER, TITULO_VENTANA_OBTENER, ICONO_OBTENER);
    }

    
    

    private String mostrarVentanaActualizar() {  
        return mostrarVentanaParaObtenerNombre(MENSAJE_VENTANA_ACTUALIZAR, TITULO_VENTANA_ACTUALIZAR, ICONO_ACTUALIZAR); 
    }

    /**
     * Muestra la ventana para recibir el nombre a eliminar
     * @return nombre a eliminar
     */
    private String mostrarVentanaEliminar() {
        return mostrarVentanaParaObtenerNombre(MENSAJE_VENTANA_ELIMINAR, TITULO_VENTANA_ELIMINAR, ICONO_ELIMINAR);
    }

    
    
    /**
     * Muestra la ventana para recibir un nombre
     * @param conEsteMensaje a mostrar
     * @param conEsteTitulo a mostrar 
     * @param conEsteIcono a mostrar
     * @return el nombre ingresado
     */
    private String mostrarVentanaParaObtenerNombre(String conEsteMensaje, String conEsteTitulo, ImageIcon conEsteIcono) {
        return (String)JOptionPane.showInputDialog(
                this, //frame donde se va a utilizar o sea la ventana donde se va a mostrar
                conEsteMensaje,
                conEsteTitulo,
                JOptionPane.PLAIN_MESSAGE,//Definimos el tipo de mensaje
                conEsteIcono,//imagen para mostrar en el icono de la ventana
                SIN_VECTOR_PARA_VENTANA,// vector de opciones para mostrar en la ventana - si se agrega null entonces significa que no hay limite de opciones
                VALOR_INICIAL_RECIBIR_VENTANA);//valor inicial en el campo para ingresar la opcion en la ventana
    }

    /**
     * Notifica un correcto ingreso en la base de datos
     */
    private void mostrarVentanaIngreso() {
        JOptionPane.showMessageDialog(
                this,
                MENSAJE_VENTANA_INGRESAR,
                TITULO_VENTANA_INGRESAR,
                JOptionPane.PLAIN_MESSAGE,
                ICONO_INGRESAR);
    }
}
