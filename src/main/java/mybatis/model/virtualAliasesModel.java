package mybatis.model;

import java.time.ZonedDateTime;

public class virtualAliasesModel {
        private Long domain_id;
        private String source;
        private String destination;
        private String CurrentState;
        private ZonedDateTime DateCreate;
        private ZonedDateTime DateUpdate;
        private Long priority;
        private Long aliasforward;
        private Long user_id;
        private Long groupid;
        private Long id;

        public Long getDomain_id() {
            return domain_id;
        }

        public void setDomain_id(Long domain_id) {
            this.domain_id = domain_id;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public String getCurrentState() {
            return CurrentState;
        }

        public void setCurrentState(String currentState) {
            CurrentState = currentState;
        }

        public ZonedDateTime getDateCreate() {
            return DateCreate;
        }

        public void setDateCreate(ZonedDateTime dateCreate) {
            DateCreate = dateCreate;
        }

        public ZonedDateTime getDateUpdate() {
            return DateUpdate;
        }

        public void setDateUpdate(ZonedDateTime dateUpdate) {
            DateUpdate = dateUpdate;
        }

        public Long getPriority() {
            return priority;
        }

        public void setPriority(Long priority) {
            this.priority = priority;
        }

        public Long getAliasforward() {
            return aliasforward;
        }

        public void setAliasforward(Long aliasforward) {
            this.aliasforward = aliasforward;
        }

        public Long getUser_id() {
            return user_id;
        }

        public void setUser_id(Long user_id) {
            this.user_id = user_id;
        }

        public Long getGroupid() {
            return groupid;
        }

        public void setGroupid(Long groupid) {
            this.groupid = groupid;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
    }


