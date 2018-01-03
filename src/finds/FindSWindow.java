package finds;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;
import finds.TableData;
import java.awt.Desktop;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class FindSWindow extends javax.swing.JFrame {

    public FindSWindow() {
        initComponents();
        ResultPane.hide();
        AppRowtoJTable();
    }

    public ArrayList ListConditions() {
        ArrayList<TableData> list = new ArrayList<TableData>();
        TableData data1 = new TableData("Sunny", "Warm", "Normal", "Strong", "Warm", "Same", "Yes");
        TableData data2 = new TableData("Sunny", "Warm", "High", "Strong", "Warm", "Same", "Yes");
        TableData data3 = new TableData("Rainy", "Cold", "High", "Strong", "Warm", "Change", "No");
        TableData data4 = new TableData("Sunny", "Warm", "High", "Strong", "Cool", "Change", "Yes");
        list.add(data1);
        list.add(data2);
        list.add(data3);
        list.add(data4);
        return list;
    }

    public void AppRowtoJTable() {
        DefaultTableModel model = (DefaultTableModel) FindSTable.getModel();
        ArrayList<TableData> list = ListConditions();
        Object rowData[] = new Object[7];

        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).sky;
            rowData[1] = list.get(i).airTemp;
            rowData[2] = list.get(i).humidity;
            rowData[3] = list.get(i).wind;
            rowData[4] = list.get(i).water;
            rowData[5] = list.get(i).forecast;
            rowData[6] = list.get(i).enjoySports;
            model.addRow(rowData);
        }
    }

    public ArrayList CompareDatas() {
        ArrayList<TableData> compareList = ListConditions();
        return compareList;
    }

    public Object[][] getColAndRowDatas(JTable table) {
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
        Object[][] tableData = new Object[nRow][nCol];
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol; j++) {
                tableData[i][j] = dtm.getValueAt(i, j);
                //System.out.println(tableData[i][j]);
            }
        }
        return tableData;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        FindSTable = new javax.swing.JTable();
        InfoIcon = new javax.swing.JLabel();
        CloseIcon = new javax.swing.JLabel();
        SourceIcon = new javax.swing.JLabel();
        FindS = new javax.swing.JButton();
        ResultPane = new javax.swing.JScrollPane();
        FindSResultArea = new javax.swing.JTextArea();
        footer1 = new javax.swing.JLabel();
        footer2 = new javax.swing.JLabel();
        footer3 = new javax.swing.JLabel();
        Header = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FindSTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sky", "Air Temp.", "Humidity", "Wind", "Water", "Forecast", "Result"
            }
        ));
        jScrollPane1.setViewportView(FindSTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 510, 90));

        InfoIcon.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        InfoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/info_icon.png"))); // NOI18N
        InfoIcon.setText("Info");
        InfoIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InfoIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InfoIconMouseClicked(evt);
            }
        });
        getContentPane().add(InfoIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        CloseIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/closeIcon.png"))); // NOI18N
        CloseIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CloseIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseIconMouseClicked(evt);
            }
        });
        getContentPane().add(CloseIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        SourceIcon.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        SourceIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/external_link_icon.png"))); // NOI18N
        SourceIcon.setText("Source Graph");
        SourceIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SourceIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SourceIconMouseClicked(evt);
            }
        });
        getContentPane().add(SourceIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        FindS.setBackground(new java.awt.Color(204, 255, 255));
        FindS.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        FindS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/playIcon.png"))); // NOI18N
        FindS.setText("Let's \"Find-S\"");
        FindS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FindS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FindSMouseClicked(evt);
            }
        });
        getContentPane().add(FindS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 190, -1));

        FindSResultArea.setColumns(20);
        FindSResultArea.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        FindSResultArea.setRows(5);
        ResultPane.setViewportView(FindSResultArea);

        getContentPane().add(ResultPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 510, 60));

        footer1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        footer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        footer1.setText("Clicking the button again will redo the algorithm.");
        getContentPane().add(footer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 560, 20));

        footer2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        footer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        footer2.setText("Ufuk Özdoğan © 2017 ");
        getContentPane().add(footer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 464, 560, 30));

        footer3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        footer3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        footer3.setText("You can edit the table however you want.");
        getContentPane().add(footer3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 560, 20));

        Header.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setText("Find-S Algorithm");
        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 570, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

        setSize(new java.awt.Dimension(566, 501));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InfoIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InfoIconMouseClicked
         JOptionPane.showMessageDialog(null, 
                 "App is not bullet-proof. \n"
                         + "There are known bugs and problems mostly occur because of my bad algorithm usage.\n"
                         + "But it has a good view of the algorithm and also does it's job fairly well."
                         + "\n-ufukozdogan", 
                 "App Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_InfoIconMouseClicked

    private void CloseIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseIconMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseIconMouseClicked

    private void SourceIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SourceIconMouseClicked
        try {
        Desktop.getDesktop().browse(new URL("https://image.slidesharecdn.com/machine-learning-chapter-11-21159/95/machine-learning-chapter-11-2-27-638.jpg?cb=1422557108").toURI());
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_SourceIconMouseClicked

    private void FindSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FindSMouseClicked
        ResultPane.setVisible(true);

        Object[][] finalTableData = getColAndRowDatas(FindSTable);

        int resultcol = 6;
        ArrayList<String> result = new ArrayList<String>();
        String FindSResultLoop = "";
        
        for (int j = 0; j < 6; j++) {
            FindSResultLoop = "";
            for (int i = 0; i < 3; i++) {
                //System.out.println("Current J" + j);
                //System.out.println("Current I:" + i);
                if(finalTableData[i][resultcol] == "No" ){
                    //System.out.println(finalTableData[i][resultcol].toString() + "Current column is zero.");
                    if(finalTableData[i-1][j].toString() == finalTableData[i+1][j].toString()){
                        if(FindSResultLoop == "?"){
                            //System.out.println("Already question mark");
                            continue;
                        }
                        FindSResultLoop = finalTableData[i+1][j].toString();
                    }
                    else{
                        FindSResultLoop = "?";
                    }
                    continue;
                }
                else if(finalTableData[i+1][resultcol] == "No"){
                    //System.out.println(finalTableData[i+1][resultcol].toString() + "Next column is zero.");
                    if(FindSResultLoop == finalTableData[i][j].toString()){
                        FindSResultLoop = finalTableData[i][j].toString();
                    }
                    else{
                        FindSResultLoop = "?";
                    }
                    //System.out.println("Find S String:" + FindSResultLoop);
                    continue;
                }
                else{
                    if(FindSResultLoop == ""){
                        FindSResultLoop = finalTableData[i][j].toString();
                        //System.out.println("inside was zero." + finalTableData[i][j].toString() + "so I wrote.");
                    }
                    else if(FindSResultLoop == finalTableData[i+1][j].toString()){
                        if(FindSResultLoop.contains("?"))
                            ; // Do nothing.
                            //System.out.println("Question mark overload");
                        else
                            //System.out.println(finalTableData[i][j].toString() + "writing for this.");
                            FindSResultLoop = finalTableData[i][j].toString();
                    }
                    else{
                        //System.out.println(FindSResultLoop + "last time.");
                        //System.out.println(finalTableData[i][j].toString() + "Before writing question mark");
                        FindSResultLoop = "?";
                    }
                }
                
            }result.add(FindSResultLoop);
        }
        System.out.println(result);
        FindSResultArea.setText(result.toString());
    }//GEN-LAST:event_FindSMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindSWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel CloseIcon;
    private javax.swing.JButton FindS;
    private javax.swing.JTextArea FindSResultArea;
    private javax.swing.JTable FindSTable;
    private javax.swing.JLabel Header;
    private javax.swing.JLabel InfoIcon;
    private javax.swing.JScrollPane ResultPane;
    private javax.swing.JLabel SourceIcon;
    private javax.swing.JLabel footer1;
    private javax.swing.JLabel footer2;
    private javax.swing.JLabel footer3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
