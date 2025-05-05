#!/bin/bash

# Navigate to the directory containing this script (and the docker-compose file)
cd "$(dirname "$0")"

# Bring up the services in detached mode
echo "Starting services defined in docker-compose.yaml..."
docker-compose up -d

# Show status of all containers
echo "Current container status:"
docker-compose ps
