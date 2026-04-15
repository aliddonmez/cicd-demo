# CI/CD Demo Projesi

Java 17 ve Maven kullanilarak hazirlanmis basit bir Spring Boot REST API projesidir.

## Gereksinimler

- Java 17
- Maven
- Docker
- Jenkins

## API Endpointleri

| Metot | Endpoint | Aciklama |
| --- | --- | --- |
| GET | `/` | `CI/CD sistemi çalışıyor!` mesajini doner |
| GET | `/version` | Uygulama sürüm mesajini doner |

## Projeyi Calistirma

Terminalde proje klasorune girin:

```bash
cd cicd-demo
```

Uygulamayi Maven ile calistirin:

```bash
mvn spring-boot:run
```

Tarayicidan veya terminalden test edin:

```bash
curl http://localhost:8080/
curl http://localhost:8080/version
```

## Test Calistirma

```bash
mvn test
```

## Jar Dosyasi Olusturma

```bash
mvn clean package
```

Olusan jar dosyasi:

```text
target/cicd-demo-1.0.0.jar
```

## Docker ile Calistirma

Docker image olusturun:

```bash
docker build -t cicd-demo:1.0.0 .
```

Container olarak calistirin:

```bash
docker run -p 8080:8080 cicd-demo:1.0.0
```

## Jenkins Pipeline

Bu projede `Jenkinsfile` asagidaki adimlari calistirir:

1. Kodlari depodan alir.
2. Maven testlerini calistirir.
3. Jar paketini olusturur.
4. Docker image olusturur.

Jenkins uzerinde Java 17 ve Maven araclari tanimli olmalidir. Ornek arac isimleri:

- `jdk17`
- `maven`
