/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSplash;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFileChooser;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author lenovo
 */
public class sendnetwork extends javax.swing.JDialog {
    public static File file;
    public static String filepath;
   public static String s;
    public static String filename;
    public static Thread t;
    public static int length;
    /**
     * Creates new form sendnetwork
     */
    public sendnetwork() {
        
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        your = new javax.swing.JTextField();
        target = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        location = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        browse = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        send = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jav = new javax.swing.JRadioButton();
        jpg = new javax.swing.JRadioButton();
        mp3 = new javax.swing.JRadioButton();
        mp4 = new javax.swing.JRadioButton();
        send1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Your IP Address:");

        jLabel2.setText("Target IP Address:");

        jLabel3.setText("File Directory:");

        browse.setText("Browser...");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        jLabel4.setText("File Name:");

        send.setText("Send");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        status.setForeground(new java.awt.Color(102, 204, 0));
        status.setText("status");

        jLabel5.setText("File Type:");

        jav.setText(".java");
        buttonGroup1.add(jav);

        jpg.setText(".jpg");
        buttonGroup1.add(jpg);

        mp3.setText(".mp3");
        buttonGroup1.add(mp3);

        mp4.setText(".mp4");
        buttonGroup1.add(mp4);

        send1.setText("Close");
        send1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(browse))
                            .addComponent(target)
                            .addComponent(your)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(send)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jav)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mp3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jpg)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mp4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(send1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(your, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(target, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(browse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jav)
                    .addComponent(jpg)
                    .addComponent(mp3)
                    .addComponent(mp4))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(send)
                    .addComponent(send1))
                .addGap(18, 18, 18)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        JFileChooser fc=new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int response=fc.showSaveDialog(this);
        if(response==JFileChooser.APPROVE_OPTION){
             file= fc.getSelectedFile();
           
            filepath=file.getAbsolutePath();
            location.setText(filepath);
       try{
            String content= new JavaIDE().readFile(filepath+"\\"+filename);
       }catch(IOException e){} 
       
        }    
    }//GEN-LAST:event_browseActionPerformed

     
     
    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        filename=name.getText();
        if(filepath==null)
            filepath=location.getText()+"\\";
        t=new Thread() {
            public void run() {
                try {
                    server();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
                t.start();
try{
        client();      
}catch(IOException e){}
t.stop();

    }//GEN-LAST:event_sendActionPerformed

    private void send1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send1ActionPerformed
       dispose();
    }//GEN-LAST:event_send1ActionPerformed
    
      void server() throws IOException {
        int i=0;
        String ext=null;
        if(jav.isSelected())
        {i=1;
        ext=".java";
        }
        else if(mp3.isSelected())
        {   i=2;
        ext=".mp3";
        }
        else if(mp4.isSelected())
        { i=3;
        ext=".mp4"; 
        }
        else if(jpg.isSelected())
                {i=4;
        ext=".jpg";
                }
        
        ServerSocket ss = new ServerSocket(3432);
        Socket socket = ss.accept(); 
       
        OutputStream out;
        out=socket.getOutputStream();
        out.write(i);
        
        PrintWriter pw=new PrintWriter(out,true);
        pw.println(filename);
        out.close();
        ServerSocket dd=new ServerSocket(3434);
        Socket socketd=dd.accept();
        out=socketd.getOutputStream();
        InputStream in = new FileInputStream(filepath+"\\"+filename+ext);
        copy(in, out);
             
        out.close();
        in.close();
    }
     
public void client() throws IOException {
        Socket socket = new Socket("localhost", 3432);
        InputStream in;
        in= socket.getInputStream();
      
        int select=in.read();
        String ext=null;
        if( select==1)
        ext=".java";
        else if(select==2)
            ext=".mp3";
        else if(select==3)
            ext=".mp4";
        else
            ext=".jpg";
    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    s=br.readLine();
    in.close();
    Socket socketd= new Socket("localhost",3434);
   
    in=socketd.getInputStream();
        OutputStream out= new FileOutputStream(s+ext);
        copy(in,out);
        
        out.close();
        in.close();
    }

    static void copy(InputStream in, OutputStream out) throws IOException {
        byte[] buf = new byte[8192];
        int len = 0;
        while ((len = in.read(buf)) != -1) {
            
            out.write(buf, 0, len);
           
        }
 }
    
    /**
     * @param args the command line arguments
     */
    public  void setrun() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sendnetwork dialog = new sendnetwork();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    }
                });
                dialog.setVisible(true);
            }
        });
       
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton browse;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JRadioButton jav;
    public javax.swing.JRadioButton jpg;
    public javax.swing.JTextField location;
    public javax.swing.JRadioButton mp3;
    public javax.swing.JRadioButton mp4;
    public javax.swing.JTextField name;
    public javax.swing.JButton send;
    public javax.swing.JButton send1;
    public javax.swing.JLabel status;
    public javax.swing.JTextField target;
    public javax.swing.JTextField your;
    // End of variables declaration//GEN-END:variables
}
