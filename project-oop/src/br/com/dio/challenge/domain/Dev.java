package br.com.dio.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> subscriptionsContent = new LinkedHashSet<>();
    private Set<Content> concluedContent = new LinkedHashSet<>();

    public void subscribeBootCamp(BootCamp bootCamp) {
        this.subscriptionsContent.addAll(bootCamp.getContents());
    }

    public void progress() {
        Optional<Content> content = this.subscriptionsContent.stream().findFirst();
        if (content.isPresent()) {
            this.concluedContent.add(content.get());
            this.subscriptionsContent.remove(content.get());
        } else {
            System.err.println("You haven't any subscriptions, yet");
        }
    }

    public double calculeTotalXP() {
        return this.concluedContent.stream().mapToDouble(Content::calculate).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscriptionsContent() {
        return subscriptionsContent;
    }

    public void setSubscriptionsContent(Set<Content> subscritionsContent) {
        this.subscriptionsContent = subscritionsContent;
    }

    public Set<Content> getConcluedContent() {
        return concluedContent;
    }

    public void setConcluedContent(Set<Content> concluedContent) {
        this.concluedContent = concluedContent;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((subscriptionsContent == null) ? 0 : subscriptionsContent.hashCode());
        result = prime * result + ((concluedContent == null) ? 0 : concluedContent.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (subscriptionsContent == null) {
            if (other.subscriptionsContent != null)
                return false;
        } else if (!subscriptionsContent.equals(other.subscriptionsContent))
            return false;
        if (concluedContent == null) {
            if (other.concluedContent != null)
                return false;
        } else if (!concluedContent.equals(other.concluedContent))
            return false;
        return true;
    }
}
