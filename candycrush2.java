boolean candyCrush2(char[][] gameboard, int[] cell, char direction) {

    if(direction=='U')
    {
        char x = gameboard[cell[0]][cell[1]];
        gameboard[cell[0]][cell[1]] = gameboard[cell[0]-1][cell[1]];
        gameboard[cell[0]-1][cell[1]] = x;
    }
    if(direction=='D')
    {
        char x = gameboard[cell[0]][cell[1]];
        gameboard[cell[0]][cell[1]] = gameboard[cell[0]+1][cell[1]];
        gameboard[cell[0]+1][cell[1]] = x;
    }
    if(direction=='L')
    {
        char x = gameboard[cell[0]][cell[1]];
        gameboard[cell[0]][cell[1]] = gameboard[cell[0]][cell[1]-1];
        gameboard[cell[0]][cell[1]-1] = x;
    }
    if(direction=='R')
    {
        char x = gameboard[cell[0]][cell[1]];
        gameboard[cell[0]][cell[1]] = gameboard[cell[0]][cell[1]+1];
        gameboard[cell[0]][cell[1]+1] = x;
    }
    
    int s = 0;
    
    for(int i=0; i<gameboard.length; i++)
    {
        for(int j=0; j<gameboard[0].length-2; j++)
        {
           // System.out.print(gameboard[i][j]);
            System.out.print(gameboard[i][j] +""+ gameboard[i][j+1]+""+gameboard[i][j+2]);
            if( (gameboard[i][j] ==gameboard[i][j+1]) && (gameboard[i][j+1] == gameboard[i][j+2]) )
            {
                return true;
            }
        }
        System.out.println();
    }
       for(int i=0; i<gameboard.length; i++)
    {
        
        for(int j=0; j<gameboard[0].length-2; j++)
        {
           // System.out.print(gameboard[i][j]);
            System.out.print(gameboard[i][j] +""+ gameboard[i][j+1]+""+gameboard[i][j+2]);
            if( (gameboard[i][j] ==gameboard[i][j+1]) && (gameboard[i][j+1] == gameboard[i][j+2]) )
            {
                return true;
            }
        }
        System.out.println();
    }
    
    return false;
    
}
