/*
 * Copyright (C) 2021 - 2025 Elytrium
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.elytrium.limboauth;

import net.elytrium.commons.config.YamlConfig;

public class Messages extends YamlConfig {

  @Ignore
  public static final Messages IMP = new Messages();

  @Comment("Don't use \\n, use {NL} for new line, and {PRFX} for prefix.")

  @Create
  public GENERAL GENERAL;

  public static class GENERAL {
    public String RELOAD = "{PRFX} &aConfiguration and language files reloaded successfully!";
    public String ERROR_OCCURRED = "{PRFX} &cAn internal error has occurred!";
    public String RATELIMITED = "{PRFX} &cPlease wait before next usage!";
    public String DATABASE_ERROR_KICK = "{PRFX} &cA database error has occurred!";
    public String NOT_PLAYER = "{PRFX} &cConsole is not allowed to execute this command!";
    public String NOT_REGISTERED = "{PRFX} &cYou are not registered or your account is &6PREMIUM&c!";
    public String CRACKED_COMMAND = "{PRFX}{NL}&aYou can not use this command since your account is &6PREMIUM&a!";
    public String WRONG_PASSWORD = "{PRFX} &cPassword is wrong!";
    public String EVENT_CANCELLED = "{PRFX} Authorization event was cancelled.";
  }

  @Create
  public AUTH AUTH;

  public static class AUTH {
    public String LOGIN = "{PRFX} &aPlease, login using &6/login <password>&a, you have &6{0} &aattempts.";
    public String LOGIN_WRONG_PASSWORD = "{PRFX} &cYou've entered the wrong password, you have &6{0} &cattempts left.";
    public String LOGIN_WRONG_PASSWORD_KICK = "{PRFX}{NL}&cYou've entered the wrong password numerous times!";
    public String LOGIN_SUCCESSFUL = "{PRFX} &aSuccessfully logged in!";
    public String LOGIN_TITLE = "&fPlease, login using &6/login <password>&a.";
    public String LOGIN_SUBTITLE = "&aYou have &6{0} &aattempts left.";
    public String LOGIN_SUCCESSFUL_TITLE = "{PRFX}";
    public String LOGIN_SUCCESSFUL_SUBTITLE = "&aSuccessfully logged in!";

    public String BOSSBAR = "{PRFX} You have &6{0} &fseconds left to log in.";
    public String TIMES_UP = "{PRFX}{NL}&cAuthorization time is up.";
    public String SESSION_EXPIRED = "{PRFX} Your session has expired, log in again.";

    public String LOGIN_PREMIUM = "{PRFX} You've been logged in automatically using the premium account!";
    public String LOGIN_PREMIUM_TITLE = "{PRFX} Welcome!";
    public String LOGIN_PREMIUM_SUBTITLE = "&aYou have been logged in as premium player!";

    public String LOGIN_FLOODGATE = "{PRFX} You've been logged in automatically using the bedrock account!";
    public String LOGIN_FLOODGATE_TITLE = "{PRFX} Welcome!";
    public String LOGIN_FLOODGATE_SUBTITLE = "&aYou have been logged in as bedrock player!";
  }

  @Create
  public REGISTER REGISTER;

  public static class REGISTER {
    public String REGISTER = "{PRFX} Please, register using &6/register <password> <repeat password>";
    public String REGISTER_DIFFERENT_PASSWORDS = "{PRFX} &cThe entered passwords differ from each other!";
    public String REGISTER_PASSWORD_TOO_SHORT = "{PRFX} &cYou entered a too short password, use a different one!";
    public String REGISTER_PASSWORD_TOO_LONG = "{PRFX} &cYou entered a too long password, use a different one!";
    public String REGISTER_PASSWORD_UNSAFE = "{PRFX} &cYour password is unsafe, use a different one!";
    public String REGISTER_SUCCESSFUL = "{PRFX} &aSuccessfully registered!";
    public String REGISTER_TITLE = "{PRFX}";
    public String REGISTER_SUBTITLE = "&aPlease, register using &6/register <password> <repeat password>";
    public String REGISTER_SUCCESSFUL_TITLE = "{PRFX}";
    public String REGISTER_SUCCESSFUL_SUBTITLE = "&aSuccessfully registered!";
  }

  @Create
  public CRAFTER CRAFTER;

  public static class CRAFTER {
    public String EMAIL_INPUT_PROMPT = "{PRFX} &ePlease enter a valid email address for your account: &6/email <address>";
    public String REGISTER_EMAIL_SENT = "{PRFX} &aRegistration successful! Enter the code sent to your email (&e{0}&a): &6/verify <code>";
    public String SERVICE_UNAVAILABLE = "{PRFX} &cRegistration and authentication service unavailable. Please try again later.";
    public String REGISTER_ERROR = "{PRFX} &cRegistration error: &e{0}";
    public String TWO_FACTOR_EMAIL_SENT = "{PRFX} &eTwo-factor authentication code was sent to your email.";
    public String TWO_FACTOR_DISCORD_SENT = "{PRFX} &eTwo-factor authentication code was sent via Discord.";
    public String TWO_FACTOR_CODE_PROMPT = "{PRFX} &ePlease enter your code: &6/2fa <code>";
    public String TWO_FACTOR_RESEND_HINT = "{PRFX} &7(To resend code: &6/2fa resend&7)";
    public String TWO_FACTOR_APP_REQUIRED = "{PRFX} &eTwo-factor authentication is required.";
    public String TWO_FACTOR_APP_PROMPT = "{PRFX} &eEnter the code from your authenticator app or recovery code: &6/2fa <code>";
    public String LOGIN_EMAIL_INPUT_REQUIRED = "{PRFX} &eSince you registered in-game, please enter a valid email: &6/email <address>";
    public String LOGIN_EMAIL_SENT = "{PRFX} &eTo log into your account, enter the code sent to (&e{0}&e): &6/verify <code>";
    public String LOGIN_EMAIL_RESEND_HINT = "{PRFX} &7(To resend code: &6/email resend&7)";
    public String RESEND_SUCCESS = "{PRFX} &aA new verification code has been sent successfully.";
    public String RESEND_FAILED = "{PRFX} &cCould not send code: &e{0}";
    public String RESEND_ERROR = "{PRFX} &cCode sending error: &e{0}";
    public String TWO_FACTOR_SUCCESS = "{PRFX} &aTwo-factor authentication successful!";
    public String TWO_FACTOR_INVALID_CODE = "{PRFX} &cInvalid or expired 2FA code!";
    public String TWO_FACTOR_ERROR = "{PRFX} &c2FA verification error: &e{0}";
    public String EMAIL_UPDATED_CODE_SENT = "{PRFX} &aVerification code sent to &6{0}&a!";
    public String EMAIL_CODE_INPUT_PROMPT = "{PRFX} &ePlease enter the 6-digit code: &6/verify <code> &eor &6/email <code>";
    public String EMAIL_UPDATE_FAILED = "{PRFX} &cCould not update email! Please enter a valid and unused email address.";
    public String EMAIL_UPDATE_ERROR = "{PRFX} &cEmail update error: &e{0}";
    public String EMAIL_VERIFY_SUCCESS = "{PRFX} &aYour email address has been verified successfully!";
    public String EMAIL_VERIFY_INVALID_CODE = "{PRFX} &cInvalid or expired verification code!";
    public String EMAIL_VERIFY_ERROR = "{PRFX} &cEmail verification error: &e{0}";
    public String AUTH_ERROR = "{PRFX} &cAuthentication error: &e{0}";

    public String REMINDER_2FA = "§ePlease enter your 2FA code: §6/2fa <code>";
    public String REMINDER_EMAIL_INPUT = "§ePlease enter a valid email address: §6/email <address>";
    public String REMINDER_EMAIL_CODE = "§ePlease enter your email verification code: §6/verify <code>";
  }

  @Create
  public KICK KICK;

  public static class KICK {
    public String NICKNAME_INVALID = "{PRFX}{NL}&cYour nickname contains forbidden characters. Please, change your nickname!";
    public String RECONNECT = "{PRFX}{NL}&cReconnect to the server to verify your account!";
    public String IP_LIMIT = "{PRFX}{NL}{NL}&cYour IP has reached max registered accounts. If this is an error, restart your router, or wait about 6 hours.";
    public String WRONG_NICKNAME_CASE = "{PRFX}{NL}&cYou should join using username &6{0}&c, not &6{1}&c.";
    public String REGISTRATIONS_DISABLED = "{PRFX} Registrations are currently disabled.";
  }

  @Create
  public TOTP TOTP;

  public static class TOTP {
    public String PROMPT = "{PRFX} Please, enter your 2FA key using &6/2fa <key>";
    public String TITLE = "{PRFX}";
    public String SUBTITLE = "&aEnter your 2FA key using &6/2fa <key>";
    public String SUCCESSFUL = "{PRFX} &aSuccessfully enabled 2FA!";
    public String DISABLED = "{PRFX} &aSuccessfully disabled 2FA!";
    public String USAGE = "{PRFX} Usage: &6/2fa enable <current password>&f or &6/2fa disable <totp key>&f.";
    public String WRONG = "{PRFX} &cWrong 2FA key!";
    public String ALREADY_ENABLED = "{PRFX} &c2FA is already enabled. Disable it using &6/2fa disable <key>&c.";
    public String QR = "{PRFX} Click here to open 2FA QR code in browser.";
    public String TOKEN = "{PRFX} &aYour 2FA token &7(Click to copy)&a: &6{0}";
    public String RECOVERY = "{PRFX} &aYour recovery codes &7(Click to copy)&a: &6{0}";
  }

  @Create
  public COMMANDS COMMANDS;

  public static class COMMANDS {
    public String CHANGE_PASSWORD_SUCCESSFUL = "{PRFX} &aSuccessfully changed password!";
    public String CHANGE_PASSWORD_USAGE = "{PRFX} Usage: &6/changepassword <old password> <new password>";
    public String UNREGISTER_SUCCESSFUL = "{PRFX}{NL}&aSuccessfully unregistered!";
    public String UNREGISTER_USAGE = "{PRFX} Usage: &6/unregister <current password> confirm";
    public String PREMIUM_SUCCESSFUL = "{PRFX}{NL}&aSuccessfully changed account state to &6PREMIUM&a!";
    public String ALREADY_PREMIUM = "{PRFX} &cYour account is already &6PREMIUM&c!";
    public String NOT_PREMIUM = "{PRFX} &cYour account is not &6PREMIUM&c!";
    public String PREMIUM_USAGE = "{PRFX} Usage: &6/premium <current password> confirm";
    public String DESTROY_SESSION_SUCCESSFUL = "{PRFX} &eYour session is now destroyed, you'll need to log in again after reconnecting.";
  }

  @Create
  public ADMIN ADMIN;

  public static class ADMIN {
    public String FORCE_UNREGISTER_SUCCESSFUL = "{PRFX} &6{0} &asuccessfully unregistered!";
    public String FORCE_UNREGISTER_KICK = "{PRFX}{NL}&aYou have been unregistered by an administrator!";
    public String FORCE_UNREGISTER_NOT_SUCCESSFUL = "{PRFX} &cUnable to unregister &6{0}&c. Most likely this player has never been on this server.";
    public String FORCE_UNREGISTER_USAGE = "{PRFX} Usage: &6/forceunregister <nickname>";
    public String FORCE_CHANGE_PASSWORD_SUCCESSFUL = "{PRFX} &aSuccessfully changed password for player &6{0}&a!";
    public String FORCE_CHANGE_PASSWORD_MESSAGE = "{PRFX} &aYour password has been changed to &6{0} &aby an administator!";
    public String FORCE_CHANGE_PASSWORD_NOT_SUCCESSFUL = "{PRFX} &cUnable to change password for &6{0}&c. Most likely this player has never been on this server.";
    public String FORCE_CHANGE_PASSWORD_NOT_REGISTERED = "{PRFX} &cPlayer &6{0}&c is not registered.";
    public String FORCE_CHANGE_PASSWORD_USAGE = "{PRFX} Usage: &6/forcechangepassword <nickname> <new password>";
    public String FORCE_REGISTER_USAGE = "{PRFX} Usage: &6/forceregister <nickname> <password>";
    public String FORCE_REGISTER_INCORRECT_NICKNAME = "{PRFX} &cNickname contains forbidden characters.";
    public String FORCE_REGISTER_TAKEN_NICKNAME = "{PRFX} &cThis nickname is already taken.";
    public String FORCE_REGISTER_SUCCESSFUL = "{PRFX} &aSuccessfully registered player &6{0}&a!";
    public String FORCE_REGISTER_NOT_SUCCESSFUL = "{PRFX} &cUnable to register player &6{0}&c.";
    public String FORCE_LOGIN_USAGE = "{PRFX} Usage: &6/forcelogin <nickname>";
    public String FORCE_LOGIN_SUCCESSFUL = "{PRFX} &aSuccessfully authenticated &6{0}&a!";
    public String FORCE_LOGIN_UNKNOWN_PLAYER = "{PRFX} &cUnable to find authenticating player with username &6{0}&a!";

    public String HELP_HEADER = "This server is using LimboAuth and LimboAPI.";
    public String HELP_COPYRIGHT = "(C) 2021 - 2025 Elytrium & Crafter";
    public String HELP_URL = "https://crafter.net.tr";
    public String SUBCOMMANDS_AVAILABLE = "Available subcommands:";
    public String SUBCOMMANDS_NONE = "There is no available subcommands for you.";
    public String SUBCOMMAND_RELOAD_DESC = "Reload configuration and language files.";
    public String SUBCOMMAND_TEST_CRAFTER_DESC = "Test Crafter CMS API connection.";
    public String TEST_CRAFTER_TESTING = "{PRFX} &eTesting Crafter CMS API connection...";
    public String TEST_CRAFTER_RESULT = "{PRFX} &aTest result: &f{0}";
    public String TEST_CRAFTER_NOT_AVAILABLE = "{PRFX} &cCrafter CMS API client is not available.";
  }
}
