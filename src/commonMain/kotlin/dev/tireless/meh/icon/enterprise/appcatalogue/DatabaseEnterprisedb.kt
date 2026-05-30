// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DatabaseEnterprisedb: ImageVector
  get() {
    val current = _databaseEnterprisedb
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DatabaseEnterprisedb",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M17.84 24 V12 h2.94 v2 h.12 a3.3 3.3 0 0 1 3.36 -2.28 c2.46 0 3.84 1.7 3.84 4.7 V24 h-2.95 v-7.29 c0 -1.7 -.57 -2.57 -1.98 -2.57 -1.21 0 -2.39 .64 -2.39 1.93 V24Z M4.22 24 V7.95 H14.8 v2.69 H7.26 v3.89 h6.67 v2.69 H7.26 v4.09 h7.54 V24Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17.84 24
          moveTo(x = 17.84f, y = 24.0f)
          // V 12
          verticalLineTo(y = 12.0f)
          // h 2.94
          horizontalLineToRelative(dx = 2.94f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 0.12
          horizontalLineToRelative(dx = 0.12f)
          // a 3.3 3.3 0 0 1 3.36 -2.28
          arcToRelative(
            a = 3.3f,
            b = 3.3f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.36f,
            dy1 = -2.28f,
          )
          // c 2.46 0 3.84 1.7 3.84 4.7
          curveToRelative(
            dx1 = 2.46f,
            dy1 = 0.0f,
            dx2 = 3.84f,
            dy2 = 1.7f,
            dx3 = 3.84f,
            dy3 = 4.7f,
          )
          // V 24
          verticalLineTo(y = 24.0f)
          // h -2.95
          horizontalLineToRelative(dx = -2.95f)
          // v -7.29
          verticalLineToRelative(dy = -7.29f)
          // c 0 -1.7 -0.57 -2.57 -1.98 -2.57
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.7f,
            dx2 = -0.57f,
            dy2 = -2.57f,
            dx3 = -1.98f,
            dy3 = -2.57f,
          )
          // c -1.21 0 -2.39 0.64 -2.39 1.93
          curveToRelative(
            dx1 = -1.21f,
            dy1 = 0.0f,
            dx2 = -2.39f,
            dy2 = 0.64f,
            dx3 = -2.39f,
            dy3 = 1.93f,
          )
          // V 24z
          verticalLineTo(y = 24.0f)
          close()
          // M 4.22 24
          moveTo(x = 4.22f, y = 24.0f)
          // V 7.95
          verticalLineTo(y = 7.95f)
          // H 14.8
          horizontalLineTo(x = 14.8f)
          // v 2.69
          verticalLineToRelative(dy = 2.69f)
          // H 7.26
          horizontalLineTo(x = 7.26f)
          // v 3.89
          verticalLineToRelative(dy = 3.89f)
          // h 6.67
          horizontalLineToRelative(dx = 6.67f)
          // v 2.69
          verticalLineToRelative(dy = 2.69f)
          // H 7.26
          horizontalLineTo(x = 7.26f)
          // v 4.09
          verticalLineToRelative(dy = 4.09f)
          // h 7.54
          horizontalLineToRelative(dx = 7.54f)
          // V 24z
          verticalLineTo(y = 24.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
          horizontalLineToRelative(dx = -32.0f)
          close()
        }
      }.build()
      .also { _databaseEnterprisedb = it }
  }

@Suppress("ObjectPropertyName")
private var _databaseEnterprisedb: ImageVector? = null
