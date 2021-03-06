FROM registry.eu-gb.bluemix.net/ibmliberty
COPY AuthServer.war /opt/ibm/wlp/usr/servers/defaultServer/dropins/
COPY server.xml /opt/ibm/wlp/usr/servers/defaultServer/
ENV LICENSE accept
EXPOSE 9080
# Run Liberty via the supervisor
CMD ["/root/bin/run_supervisor"]
