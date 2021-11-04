package com.company;

import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);

            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<>();
                t1.add(u);
                t1.add(v);
                t1.add(w);
                adj.add(t1);
            }

            int S = Integer.parseInt(read.readLine());

            Solution ob = new Solution();

            int[] ptr = ob.bellman_ford(V, adj, S);

            for(i=0; i<V; i++)
                System.out.print(ptr[i] + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

/*
 *   adj: vector of vectors which represents the graph
 *   S: source vertex to start traversing graph with
 *   V: number of vertices
 */
class Solution
{
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> adj, int S)
    {
        int[] distance=new int[V];

        Arrays.fill(distance,100000000);
        distance[S]=0;    //distance of source from source

        for(int t=0;t<V-1;t++)            //loop is running according to 0 indexing
        {
            for (ArrayList<Integer> i: adj)
            {
                int src=i.get(0); int dst=i.get(1); int wt=i.get(2);

                if(distance[src]!=Integer.MAX_VALUE && distance[src]+wt<distance[dst])
                {
                    distance[dst]=distance[src]+wt;
                }
            }
        }

        return distance;




    }
}


