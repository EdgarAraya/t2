/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;



class MyCustomFilter extends javax.swing.filechooser.FileFilter {
        @Override
        public boolean accept(File file) {
            // Allow only directories, or files with ".txt" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
        }
        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "Text documents (*.txt)";
        }
    } 
/**
 *
 * @author Edgar-pc
 */
public class JAplicacion extends javax.swing.JFrame {

    /**
     * Creates new form JAplicacion
   
     */
    public static ListaPuntos listaDePuntos= new ListaPuntos();
    public static ListaPoligonos listaDePoligonos= new ListaPoligonos();
    public static ListaPoligonos listaDeSubPoligonos= new ListaPoligonos();
    public static ListaRectas listaDeRectas = new ListaRectas();
    public static boolean mayor ;
    public static boolean rango;
    
    //testing
   
    public static boolean listaPoligonosCargada=false;
    public static boolean listaRectasCargada=false;
    public static boolean listaPuntosCargada=false;
    
    
    
    private static JAplicacion p;

    public static JAplicacion getInstance() {
        if (p == null) {
            p = new JAplicacion();  
        }
        return p;
    }

    String file;
    
    private static ArrayList<Punto> puntos;
    
    public static ArrayList<Punto> getPuntos(){
        if(puntos==null)
            puntos = new ArrayList();
        return puntos;    
    }
    
    
    
    
    
    
    public JAplicacion() {
 
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jDialog1 = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jFrame1 = new javax.swing.JFrame();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaConsola = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButtonMostrarLista = new javax.swing.JButton();
        jButtonMostrarPuntos = new javax.swing.JButton();
        jButtonCrearRectas = new javax.swing.JButton();
        jButtonCrearPoligonos = new javax.swing.JButton();
        jButtonCrearSubPoligono = new javax.swing.JButton();
        jButtonMenorPerimetro = new javax.swing.JButton();
        jButtonPoligonoPorIndice = new javax.swing.JButton();
        jButtonRangoPerimetro = new javax.swing.JButton();
        jButtonColaterales = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemCargarPuntos = new javax.swing.JMenuItem();
        jMenuItemCargarPorDefecto = new javax.swing.JMenuItem();

        fileChooser.setDialogTitle("Ventana abierta");
        fileChooser.setFileFilter(new MyCustomFilter());

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea2.setText(listaDePoligonos.toString());
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 234, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane4.setViewportView(jTextPane1);

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controlador de Poligonos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consola", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jTextAreaConsola.setColumns(20);
        jTextAreaConsola.setRows(5);
        jScrollPane1.setViewportView(jTextAreaConsola);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jButtonMostrarLista.setText("Mostrar Lista de Poligonos");
        jButtonMostrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarListaActionPerformed(evt);
            }
        });

        jButtonMostrarPuntos.setText("Mostrar Lista de Puntos");
        jButtonMostrarPuntos.setToolTipText("");
        jButtonMostrarPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarPuntosActionPerformed(evt);
            }
        });

        jButtonCrearRectas.setText("Crear Rectas");
        jButtonCrearRectas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearRectasActionPerformed(evt);
            }
        });

        jButtonCrearPoligonos.setText("Crear Poligonos");
        jButtonCrearPoligonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearPoligonosActionPerformed(evt);
            }
        });

        jButtonCrearSubPoligono.setText("Crear Sub-Poligono");
        jButtonCrearSubPoligono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearSubPoligonoActionPerformed(evt);
            }
        });

        jButtonMenorPerimetro.setText("Lista de Menor/Mayor Perimetros");
        jButtonMenorPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenorPerimetroActionPerformed(evt);
            }
        });

        jButtonPoligonoPorIndice.setText("Mostrar Poligono por Ind.");
        jButtonPoligonoPorIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPoligonoPorIndiceActionPerformed(evt);
            }
        });

        jButtonRangoPerimetro.setText("Mostrar Poligono Rango Perimetro");
        jButtonRangoPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRangoPerimetroActionPerformed(evt);
            }
        });

        jButtonColaterales.setText("Verificar Poligonos Colaterales");
        jButtonColaterales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColateralesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel1.setText("<html>\nTip: Para comenzar a usar el programa, cargue los <br>\npuntos en la esquina superior izquierda, en el menu<br>\n\"Puntos\", puede cargarlos desde un directorio o <br>\nusar los puntos por defecto del programa.\n</html>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonMostrarLista)
                    .addComponent(jButtonMostrarPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCrearRectas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCrearPoligonos)
                    .addComponent(jButtonMenorPerimetro)
                    .addComponent(jButtonCrearSubPoligono)
                    .addComponent(jButtonPoligonoPorIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRangoPerimetro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonColaterales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonColaterales, jButtonCrearPoligonos, jButtonCrearRectas, jButtonCrearSubPoligono, jButtonMenorPerimetro, jButtonMostrarLista, jButtonMostrarPuntos, jButtonPoligonoPorIndice, jButtonRangoPerimetro});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonMostrarLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonMostrarPuntos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCrearRectas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCrearPoligonos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCrearSubPoligono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonMenorPerimetro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRangoPerimetro)
                .addGap(11, 11, 11)
                .addComponent(jButtonPoligonoPorIndice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonColaterales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel2.setText("<html>\nCada opcion cumple la siguiente funcion: <br>\n-Mostrar Lista de Polígonos: Muestra los polígonos<br> \nde la colección de polígonos creados o de sub-polígonos.<br> <br>\n-Mostrar Lista de Puntos: Muestra en la consola principal<br> \nlos puntos cargados actualmente.<br> <br>\n-Crear Rectas: Crear rectas a partir de un punto inicial a final,<br>\nusa los puntos cargados por el usuario.<br> <br>\n-Crear Poligonos: Permite crear un polígono a partir de las rectas<br>\ngeneradas por el usuario.<br> <br>\n-Crear Sub-Polígono:Permite crear un sub-polígono a partir de los <br> \npolígonos creados, se puede crear automáticamente para todos o<br> \nbien de manera manual.<br> <br>\n-Lista de Menor/Mayor Perimetros: Muestra al usuario los polígonos con<br>\nel menor o mayor perímetro, según elección.<br> <br>\n-Mostrar Poligono Rango Perimetro: Muestra al usuario los polígonos con<br> \nel perímetro que se encuentra dentro del rango ingresado.<br> <br>\n-Mostrar Poligono poe Ind: Permite al usuario acceder a información de un <br> \npoligono determinado de la colección.<br> <br>\n-Verificar Poligonos Colaterales: Permite al usuario averiguar si dos polígonos<br>\nde la colección son colaterales (tienen al menos un lado en común).<br> <br>\n\n\n\n</html>");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Puntos");

        jMenu3.setText("Cargar Puntos...");

        jMenuItemCargarPuntos.setText("Desde Archivo");
        jMenuItemCargarPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCargarPuntosActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemCargarPuntos);

        jMenuItemCargarPorDefecto.setText("Por Defecto");
        jMenuItemCargarPorDefecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCargarPorDefectoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemCargarPorDefecto);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMostrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarListaActionPerformed
        // TODO add your handling code here:
        JListaPoligonos.getInstance().setVisible(true);
      
        //jDialog1.setVisible(true);
        
        String sub="";
        if (listaDeSubPoligonos.getSize()!=0){
            sub="Lista de SubPoligonos:\n"+listaDeSubPoligonos;
            
        }
        
        
        
        jTextAreaConsola.setText(listaDePoligonos.toString()+sub);
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButtonMostrarListaActionPerformed

    private void jMenuItemCargarPorDefectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCargarPorDefectoActionPerformed
        // TODO add your handling code here:
        /*
        Punto f1 = new Punto((byte)0,(byte)0);
        Punto f2 = new Punto((byte)-2,(byte)0);
        
        Punto f3 = new Punto((byte)-2,(byte)0);
        Punto f4 = new Punto((byte)-2,(byte)2);
        
        Punto f5= new Punto((byte)-2,(byte)2);
        Punto f6= new Punto((byte)0,(byte)2);
        
        Punto f7= new Punto((byte)0,(byte)2);
        Punto f8= new Punto((byte)0,(byte)0);
        Recta rt1 = new Recta(f1,f2);
        Recta rt2 = new Recta(f3,f4);
        Recta rt3 = new Recta(f5,f6);
        Recta rt4 = new Recta(f7,f8);
        Poligono p= new Poligono();
        p.addLinea(rt1);
        p.addLinea(rt2);
        p.addLinea(rt3);
        p.addLinea(rt4);
        */
       //for the moment
        
       // listaDePuntos= new ListaPuntos(); die punkte behalten
        
        for (int i = -2; i < 3;i++){
            for(int j=-2; j < 3; j++){
                Punto p1= new Punto((byte)i,(byte)j);
                
                listaDePuntos.agregarPunto(p1);
                
                
                
            }
        }
        //listaDePoligonos.agregarPoligono(p);
        listaPuntosCargada=true;
    }//GEN-LAST:event_jMenuItemCargarPorDefectoActionPerformed

    private void jMenuItemCargarPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCargarPuntosActionPerformed
        // TODO add your handling code here:
        
        JCrearRectas.getinstance().setCargado(false);
        
        
         int returnVal = fileChooser.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        try {
          // What to do with the file, e.g. display it in a TextArea
          try(FileReader fr = new FileReader(file.getAbsolutePath());
                BufferedReader  br = new BufferedReader(fr)){
                String sCurrentLine, aux = "";
                String[] aux1;
                getPuntos().clear();
                while ((sCurrentLine = br.readLine()) != null) {
                    aux1 = sCurrentLine.split(";");
                    aux += sCurrentLine + "\n";
                    getPuntos().add(new Punto(
                            Byte.parseByte(aux1[0].trim()),
                            Byte.parseByte(aux1[1].trim()))
                            
                            
                    );
                    
                    
                    System.out.println(aux1[0]+","+aux1[1]);
                }
                jTextAreaConsola.setText(aux);
            } catch (IOException e) {
                e.printStackTrace();
            }
          //listaDePuntos= new ListaPuntos(); als 
          for (int i=0; i <puntos.size();i++){
              listaDePuntos.agregarPunto(getPuntos().get(i));
          }
          
           
          listaPuntosCargada=true;
          
          
          
          
          
          jTextAreaConsola.read( new FileReader( file.getAbsolutePath() ), null );
        } catch (IOException ex) {
          System.out.println("Problema accediendo archivo"+file.getAbsolutePath());
          jTextAreaConsola.setText("Problema accediendo archivo"+file.getAbsolutePath());
          
        }
    } else {
        System.out.println("Acceso de archivo cancelado por usuario");
        jTextAreaConsola.setText("Acceso de archivo cancelado por usuario");
    }
        
        
    }//GEN-LAST:event_jMenuItemCargarPuntosActionPerformed

    private void jButtonMostrarPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarPuntosActionPerformed
        // TODO add your handling code here:
        
        if (listaDePuntos.getSize()>0){
        
        
        jTextAreaConsola.setText(listaDePuntos.toString());
        
        
        
        }else{
            
            jTextAreaConsola.setText("No hay puntos cargados.\nPara cargar puntos acceda a la opción Puntos");
            
            
        }
    }//GEN-LAST:event_jButtonMostrarPuntosActionPerformed

    private void jButtonCrearRectasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearRectasActionPerformed
        JCrearRectas.getinstance().setVisible(true);
        
        
        
    }//GEN-LAST:event_jButtonCrearRectasActionPerformed

    private void jButtonCrearPoligonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearPoligonosActionPerformed
        // TODO add your handling code here:
        
        
        
        
        JCrearPoligono.getInstance().setVisible(true);
        
        
    }//GEN-LAST:event_jButtonCrearPoligonosActionPerformed

    private void jButtonCrearSubPoligonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearSubPoligonoActionPerformed
        // TODO add your handling code here:
         for (int i = 0; i < listaDePoligonos.totalPoligonos();i++){

                 if ( JSubPoligono.getInstance().getjPoligonos().getItemAt(i) == null )//parche 
                     
                 {
                    JSubPoligono.getInstance().getjPoligonos().addItem("Poligono "+(i+1));
                 }
               
            }
        
        
        
        
        
        
        JSubPoligono.getInstance().setVisible(true);
        
        
        
    }//GEN-LAST:event_jButtonCrearSubPoligonoActionPerformed

    private void jButtonMenorPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenorPerimetroActionPerformed
        // TODO add your handling code here:
        mayor=true;
        JPerimetro.getInstance().setVisible(true);
        
        
        
        
        
    }//GEN-LAST:event_jButtonMenorPerimetroActionPerformed

    private void jButtonRangoPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRangoPerimetroActionPerformed
        // TODO add your handling code here:
        
        JRango.getInstance().setVisible(true);
        
        
        
    }//GEN-LAST:event_jButtonRangoPerimetroActionPerformed

    private void jButtonColateralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColateralesActionPerformed
        // TODO add your handling code here:
        
        if(listaDePoligonos.totalPoligonos()!=0 && listaPoligonosCargada){
          //  System.out.println("test1");
            //JColaterales.getInstance().getjPoligono1().removeAllItems();//fix out of bounds
            
           // System.out.println("test2");
            
            
            for (int i = 0; i < listaDePoligonos.totalPoligonos();i++){

                 if ( JColaterales.getInstance().getjPoligono1().getItemAt(i) == null )//parche 
                     
                 {
                    JColaterales.getInstance().getjPoligono1().addItem("Poligono "+(i+1));
                 }
               
            }
            
            
            
           // System.out.println("test3");
           // JColaterales.getInstance().getjPoligono2().removeAllItems();//fix out of bounds
            for (int i = 0; i < listaDePoligonos.totalPoligonos();i++){

                
                 if ( JColaterales.getInstance().getjPoligono2().getItemAt(i) == null ){
                     
                    JColaterales.getInstance().getjPoligono2().addItem("Poligono "+(i+1));
               
                 }
            }
            
         
        
        }
        JColaterales.getInstance().setVisible(true);
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButtonColateralesActionPerformed

    private void jButtonPoligonoPorIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPoligonoPorIndiceActionPerformed
        // TODO add your handling code here:
         if(listaDePoligonos.totalPoligonos()!=0 && listaPoligonosCargada){
          
   
            for (int i = 0; i < listaDePoligonos.totalPoligonos();i++){

                 if ( JIndice.getInstance().getjPoligonos().getItemAt(i) == null )//parche 
                     
                 {
                    JIndice.getInstance().getjPoligonos().addItem("Poligono "+(i+1));
                 }
               
            
        
            }
        
        
         }
        
        
        
        
        
        JIndice.getInstance().setVisible(true);
    }//GEN-LAST:event_jButtonPoligonoPorIndiceActionPerformed

    
    
    
    
    
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
            java.util.logging.Logger.getLogger(JAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JAplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton jButtonColaterales;
    private javax.swing.JButton jButtonCrearPoligonos;
    private javax.swing.JButton jButtonCrearRectas;
    private javax.swing.JButton jButtonCrearSubPoligono;
    private javax.swing.JButton jButtonMenorPerimetro;
    private javax.swing.JButton jButtonMostrarLista;
    private javax.swing.JButton jButtonMostrarPuntos;
    private javax.swing.JButton jButtonPoligonoPorIndice;
    private javax.swing.JButton jButtonRangoPerimetro;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCargarPorDefecto;
    private javax.swing.JMenuItem jMenuItemCargarPuntos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextAreaConsola;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
