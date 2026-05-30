// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StorageRequest: ImageVector
  get() {
    val current = _storageRequest
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.StorageRequest",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M4 21 H2 v3 a2 2 0 0 0 2 2 h3 v-2 H4Z M4 8 h3 V6 H4 a2 2 0 0 0 -2 2 v3 h2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 21
          moveTo(x = 4.0f, y = 21.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 4z
          horizontalLineTo(x = 4.0f)
          close()
          // M 4 8
          moveTo(x = 4.0f, y = 8.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
        }
        // <rect width="6" height="2" x="17.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 6
          moveTo(x = 17.0f, y = 6.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // <rect width="6" height="2" x="9.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 6
          moveTo(x = 9.0f, y = 6.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // <rect width="6" height="2" x="17.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 24
          moveTo(x = 17.0f, y = 24.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // <polygon points="28.0 15.0 4.0 15.0 4.0 13.0 2.0 13.0 2.0 19.0 4.0 19.0 4.0 17.0 28.0 17.0 28.0 19.0 30.0 19.0 30.0 13.0 28.0 13.0 28.0 15.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 15
          moveTo(x = 28.0f, y = 15.0f)
          // L 4 15
          lineTo(x = 4.0f, y = 15.0f)
          // L 4 13
          lineTo(x = 4.0f, y = 13.0f)
          // L 2 13
          lineTo(x = 2.0f, y = 13.0f)
          // L 2 19
          lineTo(x = 2.0f, y = 19.0f)
          // L 4 19
          lineTo(x = 4.0f, y = 19.0f)
          // L 4 17
          lineTo(x = 4.0f, y = 17.0f)
          // L 28 17
          lineTo(x = 28.0f, y = 17.0f)
          // L 28 19
          lineTo(x = 28.0f, y = 19.0f)
          // L 30 19
          lineTo(x = 30.0f, y = 19.0f)
          // L 30 13
          lineTo(x = 30.0f, y = 13.0f)
          // L 28 13
          lineTo(x = 28.0f, y = 13.0f)
          // L 28 15z
          lineTo(x = 28.0f, y = 15.0f)
          close()
        }
        // M28 24 h-3 v2 h3 a2 2 0 0 0 2 -2 v-3 h-2Z m0 -18 h-3 v2 h3 v3 h2 V8 a2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 24
          moveTo(x = 28.0f, y = 24.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
          // m 0 -18
          moveToRelative(dx = 0.0f, dy = -18.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
        }
        // <rect width="6" height="2" x="9.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 24
          moveTo(x = 9.0f, y = 24.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -6z
          horizontalLineToRelative(dx = -6.0f)
          close()
        }
        // <circle cx="7.0" cy="12.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 12
          moveTo(x = 7.0f, y = 12.0f)
          // m -1 0
          moveToRelative(dx = -1.0f, dy = 0.0f)
          // a 1 1 0 1 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 1 1 -2 0z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <circle cx="7.0" cy="20.0" radius="1.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 20
          moveTo(x = 7.0f, y = 20.0f)
          // m -1 0
          moveToRelative(dx = -1.0f, dy = 0.0f)
          // a 1 1 0 1 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 1 1 -2 0z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
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
      .also { _storageRequest = it }
  }

@Suppress("ObjectPropertyName")
private var _storageRequest: ImageVector? = null
