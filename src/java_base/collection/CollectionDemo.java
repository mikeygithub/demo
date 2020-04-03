package java_base.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/**
 * @ProjectName demo
 * @Author 麦奇
 * @Email biaogejiushibiao@outlook.com
 * @Date 4/3/20 1:56 PM
 * @Version 1.0
 * @Description:
 **/

public class CollectionDemo {


    public static void main(String[] args) {

        Collections.unmodifiableMap(new Map<Object, Object>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Object get(Object key) {
                return null;
            }

            @Override
            public Object put(Object key, Object value) {
                return null;
            }

            @Override
            public Object remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<?, ?> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<Object> keySet() {
                return null;
            }

            @Override
            public Collection<Object> values() {
                return null;
            }

            @Override
            public Set<Entry<Object, Object>> entrySet() {
                return null;
            }
        });


    }
}
