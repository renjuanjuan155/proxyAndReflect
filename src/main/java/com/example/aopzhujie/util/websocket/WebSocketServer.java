package com.example.aopzhujie.util.websocket;/*
package com.portal.util.websocket;


import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

*/
/**
 * @ServerEndpoint 注解是一个类层次的注解，它的功能主要是将目前的类定义成一个websocket服务器端,
 * 注解的值将被用于监听用户连接的终端访问URL地址,客户端可以通过这个URL来连接到WebSocket服务器端
 *//*

@ServerEndpoint("/websocket/{userId}")
public class WebSocketServer {
    //静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
    private static int onlineCount = 0;

    //concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。若要实现服务端与单一客户端通信的话，可以使用Map来存放，其中Key可以为用户标识
    private static CopyOnWriteArraySet<WebSocketServer> webSocketSet = new CopyOnWriteArraySet<WebSocketServer>();

//    private static Map<String, WebSocket> map = new HashMap<>();

//    private static Map<String, Map<String,Object>> map = new HashMap<>();

    public static List<String> userList = new ArrayList<>();

    //与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;

//    RestTemplate restTemplate = new RestTemplate();

    */
/**
     * 连接建立成功调用的方法
     *
     * @param session 可选的参数。session为与某个客户端的连接会话，需要通过它来给客户端发送数据
     *//*

    @OnOpen
    public void onOpen(@PathParam("userId") String userId,Session session) {
        try{
            this.session = session;
            webSocketSet.add(this);     //加入set中
            if(!userList.contains(userId)){
                userList.add(userId);
                addOnlineCount();           //在线数加1
                System.out.println("有新连接加入！当前在线人数为" + getOnlineCount());
            }
        }catch (Exception e){
            System.out.println("===============连接异常=================");
            e.printStackTrace();
        }

//        if(!StringUtils.isEmpty(userId)){
//            ResponseEntity<Map> response = restTemplate.getForEntity("http://127.0.0.1:8888/ldc/msg/selectUserMsgCounts?userId="+userId,Map.class);
//            int counts = (Integer)response.getBody().get("data");
//            Map<String,Object> result = new HashMap<>();
//            result.put("counts",counts);
//            map.put(userId,result);
//        }
    }

    */
/**
     * 连接关闭调用的方法
     *//*

    @OnClose
    public void onClose(@PathParam("userId") String userId) {
        try{
            webSocketSet.remove(this);  //从set中删除
            userList.remove(userId);
            if(WebSocketServer.onlineCount > 0){
                subOnlineCount();           //在线数减1
                System.out.println("有一连接关闭！当前在线人数为" + getOnlineCount());
            }
        }catch (Exception e){
            System.out.println("===============关闭异常=================");
            e.printStackTrace();
        }
    }

    */
/**
     * 收到客户端消息后调用的方法
     *
     * @param userId 客户端发送过来的消息
     * @param session 可选的参数
     *//*

    @OnMessage
    public void onMessage(String userId, Session session) {
        System.out.println("来自客户端的消息:" + userId);

//        int result = 0;
//        if(!StringUtils.isEmpty(userId)){
//            ResponseEntity<Map> response = restTemplate.getForEntity("http://127.0.0.1:8888/ldc/msg/selectUserMsgCounts?userId="+userId,Map.class);
//            result = (Integer)response.getBody().get("data");
//        }
//        try {
//            this.sendMessage(result+"");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //群发消息
//        for (WebSocketController item : webSocketSet) {
//            try {
//                item.sendMessage(message);
//            } catch (IOException e) {
//                e.printStackTrace();
//                continue;
//            }
//        }
    }

    */
/**
     * 发生错误时调用
     *
     * @param session
     * @param error
     *//*

    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println("发生错误");
        error.printStackTrace();
    }

    */
/**
     * 这个方法与上面几个方法不一样。没有用注解，是根据自己需要添加的方法。
     *
     * @param message
     * @throws IOException
     *//*

    public void sendMessage(String message){
        try{
            this.session.getBasicRemote().sendText(message);
        }catch (Exception e){
            System.out.println("===============发送消息异常=================");
            e.printStackTrace();
        }

        //this.session.getAsyncRemote().sendText(message);
    }

    */
/**
     * 这个方法与上面几个方法不一样。没有用注解，是根据自己需要添加的方法。
     *
     * @param message
     * @throws IOException
     *//*

    public void sendMessage(Map<String,Object> message) throws IOException {
        try {
            this.session.getBasicRemote().sendObject(message);
        } catch (EncodeException e) {
            e.printStackTrace();
        }
        //this.session.getAsyncRemote().sendText(message);
    }

    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized void addOnlineCount() {
        WebSocketServer.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        WebSocketServer.onlineCount--;
    }

    */
/**
     * 群发自定义消息
     * *//*

    public static void sendInfo(String message){
        for (WebSocketServer item : webSocketSet) {
            try {
                item.sendMessage(message);
            } catch (Exception e) {
                continue;
            }
        }
    }

    */
/**
     * 群发自定义消息
     * *//*

    public static void sendInfo(Map<String,Object> message) throws IOException {
        for (WebSocketServer item : webSocketSet) {
            try {
                item.sendMessage(message);
            } catch (IOException e) {
                continue;
            }
        }
    }

}
*/
