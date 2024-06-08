#!/bin/sh

echo "serve ollama"
/bin/ollama serve &

echo "Running ollama pull $MODEL..."
timeout=60 # Timeout in seconds
end=$((SECONDS + $timeout))

# Loop until the timeout is reached
while [ $SECONDS -lt $end ]; do
    echo "Attempting to pull $MODEL..."
    /bin/ollama pull $MODEL && break
    echo "Failed to pull $MODEL. Retrying in 5 seconds..."
    sleep 5
done