# OpenAI Proxy

Run
```bash
./gradlew clean build -Dquarkus.package.type=native

OPENAI_API_KEY=sk-xxx ./build/openai-proxy-1.0-SNAPSHOT-runner

curl -X POST http://localhost:8080/api/v1/proxy \
  -H "Content-Type: application/json" \
  -d '{
  "model": "gpt-3.5-turbo",
  "messages": [
  {"role": "system", "content": "You are a helpful assistant."},
  {"role": "user", "content": "Say howdy!"}
  ],
  "max_tokens": 10
  }'```