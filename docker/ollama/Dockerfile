FROM ollama/ollama:rocm
EXPOSE 11434
ARG MODEL=llama3
COPY init.sh /usr/local/bin/
RUN chmod +x /usr/local/bin/init.sh && init.sh