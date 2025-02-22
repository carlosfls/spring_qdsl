-- Insertar datos de ejemplo en la tabla `country`
INSERT INTO country (is_active, updated_at, create_at, creator_user_id, updater_user_id, uuid, code, name)
VALUES
(1, NOW(), NOW(), 'admin', 'admin', UUID(), 'US', 'United States'),
(1, NOW(), NOW(), 'admin', 'admin', UUID(), 'CA', 'Canada'),
(1, NOW(), NOW(), 'admin', 'admin', UUID(), 'MX', 'Mexico'),
(1, NOW(), NOW(), 'admin', 'admin', UUID(), 'BR', 'Brazil'),
(1, NOW(), NOW(), 'admin', 'admin', UUID(), 'AR', 'Argentina'),
(1, NOW(), NOW(), 'admin', 'admin', UUID(), 'ES', 'Spain'),
(1, NOW(), NOW(), 'admin', 'admin', UUID(), 'FR', 'France'),
(1, NOW(), NOW(), 'admin', 'admin', UUID(), 'DE', 'Germany'),
(1, NOW(), NOW(), 'admin', 'admin', UUID(), 'IT', 'Italy'),
(1, NOW(), NOW(), 'admin', 'admin', UUID(), 'JP', 'Japan');


-- Insertar datos de ejemplo en la tabla `city`
INSERT INTO city (is_active, updated_at, create_at, creator_user_id, updater_user_id, uuid, code, name, longitude, latitude, country_id, display_name, external_code)
VALUES
    -- Ciudades de Estados Unidos (country_id = 1)
    (1, NOW(), NOW(), 'admin', 'admin', UUID(), 'NYC', 'New York City', -74.0060, 40.7128, 1, 'New York, USA', 'NYC-001'),
    (1, NOW(), NOW(), 'admin', 'admin', UUID(), 'LAX', 'Los Angeles', -118.2437, 34.0522, 1, 'Los Angeles, USA', 'LAX-001'),

    -- Ciudades de Canadá (country_id = 2)
    (1, NOW(), NOW(), 'admin', 'admin', UUID(), 'TOR', 'Toronto', -79.3832, 43.6532, 2, 'Toronto, Canada', 'TOR-001'),
    (1, NOW(), NOW(), 'admin', 'admin', UUID(), 'VAN', 'Vancouver', -123.1207, 49.2827, 2, 'Vancouver, Canada', 'VAN-001'),

    -- Ciudades de México (country_id = 3)
    (1, NOW(), NOW(), 'admin', 'admin', UUID(), 'MEX', 'Mexico City', -99.1332, 19.4326, 3, 'Mexico City, Mexico', 'MEX-001'),
    (1, NOW(), NOW(), 'admin', 'admin', UUID(), 'GDL', 'Guadalajara', -103.3496, 20.6597, 3, 'Guadalajara, Mexico', 'GDL-001'),

    -- Ciudades de Brasil (country_id = 4)
    (1, NOW(), NOW(), 'admin', 'admin', UUID(), 'SAO', 'São Paulo', -46.6333, -23.5505, 4, 'São Paulo, Brazil', 'SAO-001'),
    (1, NOW(), NOW(), 'admin', 'admin', UUID(), 'RIO', 'Rio de Janeiro', -43.1729, -22.9068, 4, 'Rio de Janeiro, Brazil', 'RIO-001'),

    -- Ciudades de Argentina (country_id = 5)
    (1, NOW(), NOW(), 'admin', 'admin', UUID(), 'BUE', 'Buenos Aires', -58.3816, -34.6037, 5, 'Buenos Aires, Argentina', 'BUE-001'),
    (1, NOW(), NOW(), 'admin', 'admin', UUID(), 'COR', 'Córdoba', -64.1888, -31.4201, 5, 'Córdoba, Argentina', 'COR-001'),

    -- Ciudades de España (country_id = 6)
    (1, NOW(), NOW(), 'admin', 'admin', UUID(), 'MAD', 'Madrid', -3.7038, 40.4168, 6, 'Madrid, Spain', 'MAD-001'),
    (1, NOW(), NOW(), 'admin', 'admin', UUID(), 'BAR', 'Barcelona', 2.15899, 41.38879, 6, 'Barcelona, Spain', 'BAR-001'),

    -- Ciudades de Francia (country_id = 7)
    (1, NOW(), NOW(), 'admin', 'admin', UUID(), 'PAR', 'Paris', 2.3522, 48.8566, 7, 'Paris, France', 'PAR-001'),
    (1, NOW(), NOW(), 'admin', 'admin', UUID(), 'LYO', 'Lyon', 4.8357, 45.7640, 7, 'Lyon, France', 'LYO-001'),

    -- Ciudades de Alemania (country_id = 8)
    (1, NOW(), NOW(), 'admin', 'admin', UUID(), 'BER', 'Berlin', 13.4050, 52.5200, 8, 'Berlin, Germany', 'BER-001'),
    (1, NOW(), NOW(), 'admin', 'admin', UUID(), 'MUN', 'Munich', 11.5820, 48.1351, 8, 'Munich, Germany', 'MUN-001'),

    -- Ciudades de Italia (country_id = 9)
    (1, NOW(), NOW(), 'admin', 'admin', UUID(), 'ROM', 'Rome', 12.4964, 41.9028, 9, 'Rome, Italy', 'ROM-001'),
    (1, NOW(), NOW(), 'admin', 'admin', UUID(), 'MIL', 'Milan', 9.1900, 45.4642, 9, 'Milan, Italy', 'MIL-001'),

    -- Ciudades de Japón (country_id = 10)
    (1, NOW(), NOW(), 'admin', 'admin', UUID(), 'TOK', 'Tokyo', 139.6917, 35.6895, 10, 'Tokyo, Japan', 'TOK-001'),
    (1, NOW(), NOW(), 'admin', 'admin', UUID(), 'OSA', 'Osaka', 135.5022, 34.6937, 10, 'Osaka, Japan', 'OSA-001');


-- Insertar datos de ejemplo en la tabla `enterprise_v2`
INSERT INTO enterprise_v2 (is_active, updated_at, create_at, creator_user_id, updater_user_id, identification_number, business_name, web, img, country_id, code, name, business_code, description, email, web_link, logo, schedule, reason, phones, experiencesDiners, typology)
VALUES
    -- Empresa en Estados Unidos (country_id = 1)
    (1, NOW(), NOW(), 'admin', 'admin', '123456789', 'Tech Solutions Inc.', 'www.techsolutions.com', 'tech_logo.png', 1, 'TSI', 'Tech Solutions', 'TSI-001', 'Leading tech company in the US.', 'info@techsolutions.com', 'www.techsolutions.com', 'logo_tech.png', 1, 'Innovation in technology', '+1-800-123-4567', '5-star', 1),

    -- Empresa en Canadá (country_id = 2)
    (1, NOW(), NOW(), 'admin', 'admin', '987654321', 'Maple Foods Ltd.', 'www.maplefoods.ca', 'maple_logo.png', 2, 'MFL', 'Maple Foods', 'MFL-001', 'Premium food products from Canada.', 'info@maplefoods.ca', 'www.maplefoods.ca', 'logo_maple.png', 1, 'Quality and tradition', '+1-800-987-6543', '4-star', 2),

    -- Empresa en México (country_id = 3)
    (1, NOW(), NOW(), 'admin', 'admin', '456789123', 'Mexican Crafts Co.', 'www.mexicancrafts.com', 'crafts_logo.png', 3, 'MCC', 'Mexican Crafts', 'MCC-001', 'Handmade crafts from Mexico.', 'info@mexicancrafts.com', 'www.mexicancrafts.com', 'logo_crafts.png', 1, 'Preserving cultural heritage', '+52-55-1234-5678', '3-star', 1),

    -- Empresa en Brasil (country_id = 4)
    (1, NOW(), NOW(), 'admin', 'admin', '321654987', 'Amazon Eco Tours', 'www.amazonecotours.com.br', 'amazon_logo.png', 4, 'AET', 'Amazon Eco Tours', 'AET-001', 'Eco-friendly tours in the Amazon rainforest.', 'info@amazonecotours.com.br', 'www.amazonecotours.com.br', 'logo_amazon.png', 1, 'Sustainable tourism', '+55-11-9876-5432', '5-star', 1),

    -- Empresa en Argentina (country_id = 5)
    (1, NOW(), NOW(), 'admin', 'admin', '654987321', 'Tango Music Records', 'www.tangomusic.com.ar', 'tango_logo.png', 5, 'TMR', 'Tango Music Records', 'TMR-001', 'Promoting tango music worldwide.', 'info@tangomusic.com.ar', 'www.tangomusic.com.ar', 'logo_tango.png', 1, 'Cultural promotion', '+54-11-1234-5678', '4-star', 2),

    -- Empresa en España (country_id = 6)
    (1, NOW(), NOW(), 'admin', 'admin', '789123456', 'Spanish Wines Co.', 'www.spanishwines.es', 'wines_logo.png', 6, 'SWC', 'Spanish Wines', 'SWC-001', 'Finest wines from Spain.', 'info@spanishwines.es', 'www.spanishwines.es', 'logo_wines.png', 1, 'Wine excellence', '+34-91-987-6543', '5-star', 0),

    -- Empresa en Francia (country_id = 7)
    (1, NOW(), NOW(), 'admin', 'admin', '159753486', 'Paris Fashion House', 'www.parisfashion.com', 'fashion_logo.png', 7, 'PFH', 'Paris Fashion House', 'PFH-001', 'Luxury fashion from Paris.', 'info@parisfashion.com', 'www.parisfashion.com', 'logo_fashion.png', 1, 'Elegance and style', '+33-1-2345-6789', '5-star', 0),

    -- Empresa en Alemania (country_id = 8)
    (1, NOW(), NOW(), 'admin', 'admin', '357951486', 'German Auto Works', 'www.germanautoworks.de', 'auto_logo.png', 8, 'GAW', 'German Auto Works', 'GAW-001', 'High-quality German automobiles.', 'info@germanautoworks.de', 'www.germanautoworks.de', 'logo_auto.png', 1, 'Engineering excellence', '+49-30-1234-5678', '5-star', 0),

    -- Empresa en Italia (country_id = 9)
    (1, NOW(), NOW(), 'admin', 'admin', '258369147', 'Italian Cuisine Ltd.', 'www.italiancuisine.it', 'cuisine_logo.png', 9, 'ICL', 'Italian Cuisine', 'ICL-001', 'Authentic Italian recipes.', 'info@italiancuisine.it', 'www.italiancuisine.it', 'logo_cuisine.png', 1, 'Taste of Italy', '+39-06-9876-5432', '4-star', 1),

    -- Empresa en Japón (country_id = 10)
    (1, NOW(), NOW(), 'admin', 'admin', '753159852', 'Tokyo Tech Solutions', 'www.tokyotech.jp', 'tokyo_logo.png', 10, 'TTS', 'Tokyo Tech Solutions', 'TTS-001', 'Cutting-edge technology from Japan.', 'info@tokyotech.jp', 'www.tokyotech.jp', 'logo_tokyo.png', 1, 'Innovation and precision', '+81-3-1234-5678', '5-star', 1);


-- Insertar datos de ejemplo en la tabla `establishment_v2`
INSERT INTO establishment_v2 (enterprise_id, city_id, code, name, business_code, longitude, latitude, email, phone, schedule, address, has_parking, pet_friendly, mall_id, is_inside_mall, phones)
VALUES
    -- Establecimiento en Nueva York (city_id = 1) para Tech Solutions Inc. (enterprise_id = 1)
    (1, 1, 'TSI-NYC', 'Tech Solutions NYC', 'TSI-NYC-001', -74.0060, 40.7128, 'nyc@techsolutions.com', '+1-212-123-4567', 'Mon-Fri 9am-5pm', '123 Tech Street, NYC', 1, 0, NULL, 0, '+1-212-123-4567'),

    -- Establecimiento en Los Ángeles (city_id = 2) para Tech Solutions Inc. (enterprise_id = 1)
    (1, 2, 'TSI-LAX', 'Tech Solutions LA', 'TSI-LAX-001', -118.2437, 34.0522, 'lax@techsolutions.com', '+1-213-987-6543', 'Mon-Fri 9am-5pm', '456 Innovation Blvd, LA', 1, 1, NULL, 0, '+1-213-987-6543'),

    -- Establecimiento en Toronto (city_id = 3) para Maple Foods Ltd. (enterprise_id = 2)
    (2, 3, 'MFL-TOR', 'Maple Foods Toronto', 'MFL-TOR-001', -79.3832, 43.6532, 'toronto@maplefoods.ca', '+1-416-123-4567', 'Mon-Sat 10am-6pm', '789 Maple Avenue, Toronto', 1, 1, NULL, 0, '+1-416-123-4567'),

    -- Establecimiento en Vancouver (city_id = 4) para Maple Foods Ltd. (enterprise_id = 2)
    (2, 4, 'MFL-VAN', 'Maple Foods Vancouver', 'MFL-VAN-001', -123.1207, 49.2827, 'vancouver@maplefoods.ca', '+1-604-987-6543', 'Mon-Sat 10am-6pm', '101 Forest Lane, Vancouver', 1, 0, NULL, 0, '+1-604-987-6543'),

    -- Establecimiento en Ciudad de México (city_id = 5) para Mexican Crafts Co. (enterprise_id = 3)
    (3, 5, 'MCC-MEX', 'Mexican Crafts Mexico City', 'MCC-MEX-001', -99.1332, 19.4326, 'mexico@mexicancrafts.com', '+52-55-1234-5678', 'Mon-Fri 9am-6pm', '234 Artisan Street, Mexico City', 0, 1, NULL, 0, '+52-55-1234-5678'),

    -- Establecimiento en São Paulo (city_id = 7) para Amazon Eco Tours (enterprise_id = 4)
    (4, 7, 'AET-SAO', 'Amazon Eco Tours São Paulo', 'AET-SAO-001', -46.6333, -23.5505, 'saopaulo@amazonecotours.com.br', '+55-11-9876-5432', 'Mon-Sun 8am-8pm', '567 Rainforest Road, São Paulo', 1, 1, NULL, 0, '+55-11-9876-5432'),

    -- Establecimiento en Buenos Aires (city_id = 9) para Tango Music Records (enterprise_id = 5)
    (5, 9, 'TMR-BUE', 'Tango Music Records Buenos Aires', 'TMR-BUE-001', -58.3816, -34.6037, 'buenosaires@tangomusic.com.ar', '+54-11-1234-5678', 'Mon-Fri 10am-7pm', '890 Tango Street, Buenos Aires', 0, 0, NULL, 0, '+54-11-1234-5678'),

    -- Establecimiento en Madrid (city_id = 11) para Spanish Wines Co. (enterprise_id = 6)
    (6, 11, 'SWC-MAD', 'Spanish Wines Madrid', 'SWC-MAD-001', -3.7038, 40.4168, 'madrid@spanishwines.es', '+34-91-987-6543', 'Mon-Sat 11am-8pm', '123 Wine Avenue, Madrid', 1, 1, NULL, 0, '+34-91-987-6543'),

    -- Establecimiento en París (city_id = 13) para Paris Fashion House (enterprise_id = 7)
    (7, 13, 'PFH-PAR', 'Paris Fashion House Paris', 'PFH-PAR-001', 2.3522, 48.8566, 'paris@parisfashion.com', '+33-1-2345-6789', 'Mon-Sat 10am-7pm', '456 Fashion Street, Paris', 1, 0, NULL, 0, '+33-1-2345-6789'),

    -- Establecimiento en Tokio (city_id = 19) para Tokyo Tech Solutions (enterprise_id = 10)
    (10, 19, 'TTS-TOK', 'Tokyo Tech Solutions Tokyo', 'TTS-TOK-001', 139.6917, 35.6895, 'tokyo@tokyotech.jp', '+81-3-1234-5678', 'Mon-Fri 9am-6pm', '789 Tech Lane, Tokyo', 1, 1, NULL, 0, '+81-3-1234-5678');