mvn clean package -Dmaven.test.skip=ture

docker build -t hub.c.163.com/jrxpay/wooden  .

docker tag wooden hub.c.163.com/jrxpay/wooden

docker push hub.c.163.com/jrxpay/wooden