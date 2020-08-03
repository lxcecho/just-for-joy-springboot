package com.xc.justforjoy;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * @author lxcecho
 * @since 2020/8/3
 */
public class HelloZK {

//    private static final Logger LOGGER = Logger.getLogger(HelloZK.class);

    private static final String CONNECTSTRING = "121.42.14.67:2181";
    private static final String PATH = "/hello_zookeeper";
    private static final int SESSION_TIMEOUT = 50 * 1000;

    public ZooKeeper startZK() throws Exception {
        return new ZooKeeper(CONNECTSTRING, SESSION_TIMEOUT, new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {

            }
        });
    }

    public void stopZK(ZooKeeper zk) throws Exception{
        if(zk != null){
            zk.close();
        }
    }

    public void createZNode(ZooKeeper zk,String path,String nodeValue) throws KeeperException, InterruptedException
    {
        zk.create(path,nodeValue.getBytes(),ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.PERSISTENT);
    }

    public String getZNode(ZooKeeper zk,String path) throws KeeperException, InterruptedException
    {
        byte[] byteArray = zk.getData(path, false, new Stat());
        return new String(byteArray);
    }

    public static void main(String[] args) throws IOException, KeeperException, InterruptedException,Exception
    {
        HelloZK hello = new HelloZK();

        ZooKeeper zk = hello.startZK();

        Stat stat = zk.exists(PATH, false);

        if(stat == null)
        {
            hello.createZNode(zk, PATH, "zk1014");
            String result = hello.getZNode(zk, PATH);
            System.out.println("**********result: "+result);
        }else{
            System.out.println("***********znode has already ok***********");
        }

        hello.stopZK(zk);
    }
































}
