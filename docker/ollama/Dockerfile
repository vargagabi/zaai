# FROM ollama/ollama:rocm as serve
# CMD ['ollama', 'serve']

# FROM ollama/ollama:rocm as run
# CMD ['/bin/ollama', 'run', 'llama3']

FROM ollama/ollama:rocm as init
EXPOSE 11434
ARG MODEL=llama3
COPY init.sh /usr/local/bin/
RUN chmod +x /usr/local/bin/init.sh && init.sh
# --no-cache=$(date +%s)
