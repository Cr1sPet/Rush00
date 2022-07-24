/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Downloader.java                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: kferterb <kferterb@student.21-school.ru    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2022/07/24 09:05:59 by kferterb          #+#    #+#             */
/*   Updated: 2022/07/24 10:11:10 by kferterb         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package game;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Downloader {

    private final String profile;

    public Downloader(String profile) {
        this.profile = profile;
    }

    public Properties download() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src/main/resources/application-" + profile + ".properties"));
        return properties;
    }
}
