package util;

public class Compare {
   
    public String StringSequenceASCENDING_Compare(String checkName[], String ASC[]) {
        String r ="False"; //Arrays.sort(checkName);
        if (ASC[0].equalsIgnoreCase(checkName[0]))   
            r="True";
        //if (ASC[1] != checkName[1])
            //r="False";
        return r;
        //Arrays.sort(checkName); 
        /*String ASC[] = new String[10]; Arrays.sort(checkName);
        for (int i = 0; i < 10; i++)
        {
            ASC[i]= checkName[i];
            //webElement = "CheckName_Cell_i";
            System.out.println(ASC[i]);
        }
        
        return r;*/
    }
    public String StringSequenceDESCENDING_Compare(String checkName[], String DESC[]){
        String r ="False"; //Arrays.sort(checkName);
        if (DESC[0].equalsIgnoreCase(checkName[0]))   
            r="True";
        //if (ASC[1] != checkName[1])
            //r="False";
        return r;        
    }
    public boolean SequenceASCENDING_Compare(String checkName[], String DESC[]){
        if (DESC[0].equalsIgnoreCase(checkName[0]))
           return true;
        return false;
    }
    public String StatusSequenceASCENDING_Compare(String checkStatus[], String ASC[]){
        String r ="True"; //Arrays.sort(checkName);
        for(int i=0;i<10; i++)
        {
            if (!ASC[i].equalsIgnoreCase(checkStatus[i]))
                r="False";
        }        
        return r;
    }
    public String StatusSequenceDESCENDING_Compare(String checkStatus[], String DESC[]){
        String r ="True"; //Arrays.sort(checkName);
        for(int i=0;i<10; i++)
        {
            if (!DESC[i].equalsIgnoreCase(checkStatus[i]))
                r="False";
        }        
        return r;
    } 
    public String DateTimeSequenceASCENDING_Compare(String checkDate[], String ASC[]){
        String r="False";
        /*for(int i=0;i<10; i++)
        {
            if (!ASC[i].equalsIgnoreCase(checkDate[i]))
                r="False";
        }     
        if (ASC[0].equalsIgnoreCase(checkDate[0]))   
            r="True"; 
        ASC[0]=ASC[0].trim();checkDate[0]=checkDate[0].trim();
        if (ASC[0].compareToIgnoreCase(checkDate[0])==0)
            r="True"; */  
        if (ASC[0].equalsIgnoreCase(checkDate[0]))   
            r="True"; 
        return r;
    }
    public String DateTimeSequenceDESCENDING_Compare(String checkDate[], String DESC[]){
        String r="False";
        /*for(int i=0;i<10; i++)
        {
            if (!DESC[i].equalsIgnoreCase(checkDate[i]))
                r="False";
        } */  
        if (DESC[0].equalsIgnoreCase(checkDate[0]))   
            r="True";        
        return r;
    }
    public String ServerOverview_PropertyASCENDING_Compare(String ASC_Char[], String ASC_Char_Sort[]){
        String r="True";
        for(int i=0;i<10; i++)
        {
            if (!ASC_Char[i].equalsIgnoreCase(ASC_Char_Sort[i]))
                r="False";
        }                  
        return r;
    }
     public String ServerOverview_PropertyDESCENDING_Compare(String DESC_Char[], String DESC_Char_Sort[]){
        String r="True";
        for(int i=0;i<10; i++)
        {
            if (!DESC_Char[i].equalsIgnoreCase(DESC_Char_Sort[i]))
                r="False";
        }                
        return r;
    }
     public String ServerOverview_Property_Search_Match(String stringContain[], String enterKey){
        String r="True";
        for(int i=0;i<4; i++)
        {            
            //if (!enterKey.contains(stringContain[i]))
            if (! stringContain[i].contains(enterKey))
                r="False";
        }              
        return r;
    }
     public String ServerOverview_DiskUsageASCENDING_Compare(String ASC[], String ServerOverview_checkDiskUsage[]){
        String r="True";
        for(int i=0;i<10; i++)
        {
            if (!ASC[i].equalsIgnoreCase(ServerOverview_checkDiskUsage[i]))
                r="False";
        }                  
        return r;
    }
     public String ServerOverview_DiskUsageDESCENDING_Compare(String DESC[], String ServerOverview_checkDiskUsage[]){
        String r="True";
        for(int i=0;i<5; i++)
        {
            if (!DESC[i].equalsIgnoreCase(ServerOverview_checkDiskUsage[i]))
                r="False";
        }                  
        return r;
    }
     public String ServerOverview_MemoryUsageASCENDING_Compare(String ASC_Char[], String Char_ASC[]) {
        String r="True";
        for(int i=0;i<10; i++)
        {
            if (!ASC_Char[i].equalsIgnoreCase(Char_ASC[i]))
                r="False";
        }                  
        return r; 
     }
      public String ServerOverview_MemoryUsageDESCENDING_Compare(String ASC_Char[], String Char_ASC[]) {
        String r="True";
        for(int i=0;i<10; i++)
        {
            if (!ASC_Char[i].equalsIgnoreCase(Char_ASC[i]))
                r="False";
        }                  
        return r; 
     }
     public String ServerOverview_LoadAverageASCENDING_Compare(String ASC_Char[], String Char_ASC[]){
        String r="True";
        for(int i=0;i<10; i++)
        {
            if (!ASC_Char[i].equalsIgnoreCase(Char_ASC[i]))
                r="False";
        }                  
        return r;
    }
     public String ServerOverview_LoadAverageDESCENDING_Compare(String DESC_Char[], String Char_DESC[]){
        String r="True";
        for(int i=0;i<10; i++)
        {
            if (!DESC_Char[i].equalsIgnoreCase(Char_DESC[i]))
                r="False";
        }                  
        return r;
    }
     public String ServerOverview_ProactiveMonitoringASCENDING_Compare(String ASC[], String ProactiveMonitoring[]){
        String r="True";
        for(int i=0;i<20; i++)
        {
            if (!ASC[i].substring(0, 4).equalsIgnoreCase(ProactiveMonitoring[i].substring(0, 4)))
                r="False";
        }                  
        return r;
    }
     public String ServerOverview_ProactiveMonitoringDESCENDING_Compare(String DESC[], String ProactiveMonitoring[]){
        String r="True";
        for(int i=10;i<20; i++)
        {
            if (!DESC[i].substring(0, 4).equalsIgnoreCase(ProactiveMonitoring[i].substring(0, 4)))
                r="False";
        }                  
        return r;
    }
     public String ServerOverview_ProactiveMonitoring_Select_Up(String stringUp[], String enterKey){
        String r="True";
        for(int i=0;i<10; i++)
        {            
            if (! stringUp[i].contains(enterKey))
                r="False";
        }              
        return r;
    }
     public String ServerOverview_PoactiveMonitoring_Select_Down(String stringDown[], String enterKey){
        String r="True";
        for(int i=0;i<10; i++)
        {            
            if (! stringDown[i].contains(enterKey))
                r="False";
        }              
        return r;
    }
     public String ServerOverview_DHCPASCENDING_Compare(String ASC[], String DHCP[]){
        String r="True";
        for(int i=10;i<20; i++)
        {
            if (!ASC[i].equalsIgnoreCase(DHCP[i]))
                r="False";
        }                  
        return r;
    }
     public String ServerOverview_DHCPDESCENDING_Compare(String DESC[], String DHCP[]){
        String r="True";
        for(int i=10;i<20; i++)
        {
            if (!DESC[i].equalsIgnoreCase(DHCP[i]))
                r="False";
        }                  
        return r;
    }
      public String ServerOverview_DHCP_Select_Up(String stringUp[], String enterKey){
        String r="True";
        for(int i=0;i<10; i++)
        {            
            if (! stringUp[i].contains(enterKey))
                r="False";
        }              
        return r;
    }
     public String ServerOverview_DHCP_Select_Down(String stringDown[], String enterKey){
        String r="True";
        for(int i=0;i<2; i++)
        {            
            if (! stringDown[i].contains(enterKey))
                r="False";
        }              
        return r;
    }
    public String ServerOverview_DNSASCENDING_Compare(String ASC[], String DNS[]){
        String r="True";
        for(int i=15;i<20; i++)
        {
            if (!ASC[i].equalsIgnoreCase(DNS[i]))
                r="False";
        }                  
        return r;
    }
     public String ServerOverview_DNSDESCENDING_Compare(String DESC[], String DNS[]){
        String r="True";
        for(int i=10;i<20; i++)
        {
            if (!DESC[i].equalsIgnoreCase(DNS[i]))
                r="False";
        }                  
        return r;
    }
      public String ServerOverview_DNS_Select_Up(String stringUp[], String enterKey){
        String r="True";
        for(int i=0;i<10; i++)
        {            
            if (! stringUp[i].contains(enterKey))
                r="False";
        }              
        return r;
    }
     public String ServerOverview_DNS_Select_Down(String stringDown[], String enterKey){
        String r="True";
        for(int i=0;i<2; i++)
        {            
            if (! stringDown[i].contains(enterKey))
                r="False";
        }              
        return r;
    }
     public String ServerOverview_ServerChecksASCENDING_Compare(String ASC[], String ServerChecks[]){
        String r="True";
        for(int i=0;i<20; i++)
        {
            if (!ASC[i].equalsIgnoreCase(ServerChecks[i]))
                r="False";
        }                  
        return r;
    }
     public String ServerOverview_ServerChecksDESCENDING_Compare(String DESC[], String ServerChecks[]){
        String r="True";
        for(int i=0;i<10; i++)
        {
            if (!DESC[i].equalsIgnoreCase(ServerChecks[i]))
                r="False";
        }                  
        return r;
    }
    public String ServerOverview_ServerChecks_Select(String ServerChecks[], String enterKey){
        String r="True";
        for(int i=10;i<20; i++)
        {            
            if (! ServerChecks[i].contains(enterKey))
                r="False";
        }              
        return r;
    }
    public String EmailAlerts_PropertyASCENDING_Compare(String ASC[], String property[]){
        String r="True";
        for(int i=6;i<10; i++)
        {
            if (!ASC[i].equalsIgnoreCase(property[i]))
                r="False";
        }                  
        return r;
    }
    public String EmailAlerts_PropertyDESCENDING_Compare(String DESC[], String property[]){
        String r="True";
        for(int i=0;i<4; i++)
        {
            if (!DESC[i].equalsIgnoreCase(property[i]))
                r="False";
        }                  
        return r;
    }
    public String EmailAlerts_PropertyCodeASCENDING_Compare(String ASC[], String propertyCode[]){
        String r="True";
        for(int i=0;i<10; i++)
        {
            if (!ASC[i].equalsIgnoreCase(propertyCode[i]))
                r="False";
        }                  
        return r;
    }
    public String EmailAlerts_PropertyCodeDESCENDING_Compare(String DESC[], String propertyCode[]){
        String r="True";
        for(int i=0;i<10; i++)
        {
            if (!DESC[i].equalsIgnoreCase(propertyCode[i]))
                r="False";
        }                  
        return r;
    }
    public String DevicesOverview__Columns_SortASC_Compare(String ASC[], String column[]){
        String r="True";
        for(int i=0;i<20; i++)
        {
            if (!ASC[i].equalsIgnoreCase(column[i]))
                r="False";
        }                  
        return r; 
    }
    public String DevicesOverview__Columns_SortDESC_Compare(String DESC[], String column[]){
        String r="True";
        for(int i=0;i<20; i++)
        {
            if (!DESC[i].equalsIgnoreCase(column[i]))
                r="False";
        }                  
        return r; 
    }
    public String DevicesOverview__Columns_SortASC_Compare(int ASC[], int column[]){
        String r="True";
        for(int i=0;i<20; i++)
        {
            if (ASC[i] != column[i])
                r="False";
        }                  
        return r; 
    }
    public String DevicesOverview__Columns_SortDESC_CompareInt(Integer DESC[], Integer column[]){
        String r="True";
        for(int i=0;i<20; i++)
        {
            if (DESC[i] != column[i])
                r="False";
        }                  
        return r; 
    }
    public String PMS_Property_Match(String property[], String key){
        String r="True";
        for(int i=0;i<20; i++)
        {
            if (!property[i].contains(key))
                r="False";
        }                  
        return r; 
    }
    public String PMS_Columns_SortASC_Compare(String ASC[], String column[]) {
        String r="True";
        for(int i=0;i<20; i++)
        {
            if (!ASC[i].equalsIgnoreCase(column[i]))
                r="False";
        }                  
        return r; 
    }
    public String PMS_Columns_SortDESC_Compare(String DESC[], String column[]) {
        String r="True";
        for(int i=0;i<20; i++)
        {
            if (!DESC[i].equalsIgnoreCase(column[i]))
                r="False";
        }                  
        return r; 
    }
    public String PMS_Columns_SortASC_CompareInt(Integer ASC[], Integer column[]) {
        String r="True";
        for(int i=0;i<20; i++)
        {
            if (ASC[i]!=column[i])
                r="False";
        }                  
        return r; 
    }
    public String PMS_Columns_SortDESC_CompareInt(Integer ASC[], Integer column[]) {
        String r="True";
        for(int i=0;i<20; i++)
        {
            if (ASC[i]!=column[i])
                r="False";
        }                  
        return r; 
    }
    public String NETWORK_Columns_SortASC_Compare(String ASC[], String column[],Integer row) {
        String r="True";
        if (row ==5)
        {
            for(int i=0;i<5; i++)
            {
                 if (!ASC[i].equalsIgnoreCase(column[i]))
                     r="False";
            } 
        }
        if (row ==10)
        {
            for(int i=0;i<10; i++)
            {
                 if (!ASC[i].equalsIgnoreCase(column[i]))
                     r="False";
            } 
        }
        if (row ==20)
        {
            for(int i=0;i<20; i++)
            {
                 if (!ASC[i].equalsIgnoreCase(column[i]))
                     r="False";
            } 
        }
        return r; 
    }
    public String NETWORK_Columns_SortDESC_Compare(String DESC[], String column[], Integer row ) {
        String r="True";
        if (row == 5)
        {
            for(int i=0;i<5; i++)
            {
                 if (!DESC[i].equalsIgnoreCase(column[i]))
                     r="False";
            }  
        }
        if (row == 10)
        {
            for(int i=0;i<10; i++)
            {
                 if (!DESC[i].equalsIgnoreCase(column[i]))
                     r="False";
            }  
        }
        if (row == 20)
        {
            for(int i=0;i<20; i++)
            {
                 if (!DESC[i].equalsIgnoreCase(column[i]))
                     r="False";
            }  
        }
        return r; 
    }
    public String NETWORK_Columns_SortASC_CompareFloat(Float ASC[], Float column[], Integer row) {
        String r="True";
        if (row ==5)
        {
            for(int i=0;i<5; i++)
            {
                if (ASC[i]!=column[i])
                   r="False";
            }  
        }
        if (row ==10)
        {
            for(int i=0;i<10; i++)
            {
                if (ASC[i]!=column[i])
                   r="False";
            }  
        }
        if (row ==20)
        {
            for(int i=0;i<20; i++)
            {
                if (ASC[i]!=column[i])
                   r="False";
            }  
        }
        return r; 
    }
    public String NETWORK_Columns_SortDESC_CompareFloat(Float ASC[], Float column[], Integer row) {
        String r="True";
        if (row ==5)
        {
            for(int i=0;i<5; i++)
            {
                if (ASC[i]!=column[i])
                   r="False";
            }
        }    
        if (row ==10)
        {
            for(int i=0;i<10; i++)
            {
                if (ASC[i]!=column[i])
                   r="False";
            }
        }  
        if (row ==20)
        {
            for(int i=0;i<20; i++)
            {
                if (ASC[i]!=column[i])
                   r="False";
            }
        }    
        return r; 
    }
    public String Columns_Contain_String(String columns[], String key, Integer row) {
        String r="True";
        if (row ==5)
        {
            for(int i=0;i<5; i++)
            {
                if (!columns[i].contains(key))
                   r="False";
            }
        }    
        if (row ==10)
        {
            for(int i=0;i<10; i++)
            {
                if (!columns[i].contains(key))
                   r="False";
            }
        }  
        if (row ==20)
        {
            for(int i=0;i<20; i++)
            {
                if (!columns[i].contains(key))
                   r="False";
            }
        }    
        return r; 
    }
    public String Columns_Contain_KeyString(String columns[], String key, Integer row) {
       String r="True";
       for(int i=0;i<row;i++)
       {
           if (!columns[i].contains(key))
                   r="False";
       }
       return r;
    }
}
