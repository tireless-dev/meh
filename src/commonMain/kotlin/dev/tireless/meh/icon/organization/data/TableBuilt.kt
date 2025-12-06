// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TableBuilt: ImageVector
  get() {
    val current = _tableBuilt
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TableBuilt",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 8 h-4 V4 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v18 a2 2 0 0 0 2 2 h4 v4 a2 2 0 0 0 2 2 h18 a2 2 0 0 0 2 -2 V10 a2 2 0 0 0 -2 -2 m-6 14 h-8 v-5 h8Z m0 -7 h-8 v-5 h8Z m-10 0 H4 v-5 h8Z M22 4 v4 H4 V4Z M4 22 v-5 h8 v5Z m24 6 H10 v-4 h12 a2 2 0 0 0 2 -2 V10 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 8
          moveTo(x = 28.0f, y = 8.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 4
          verticalLineTo(y = 4.0f)
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
          // v 18
          verticalLineToRelative(dy = 18.0f)
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
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // h 18
          horizontalLineToRelative(dx = 18.0f)
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
          // V 10
          verticalLineTo(y = 10.0f)
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
          // m -6 14
          moveToRelative(dx = -6.0f, dy = 14.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // m 0 -7
          moveToRelative(dx = 0.0f, dy = -7.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // m -10 0
          moveToRelative(dx = -10.0f, dy = 0.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
          close()
          // M 22 4
          moveTo(x = 22.0f, y = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
          close()
          // M 4 22
          moveTo(x = 4.0f, y = 22.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 5z
          verticalLineToRelative(dy = 5.0f)
          close()
          // m 24 6
          moveToRelative(dx = 24.0f, dy = 6.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
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
          // V 10
          verticalLineTo(y = 10.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
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
      .also { _tableBuilt = it }
  }

@Suppress("ObjectPropertyName")
private var _tableBuilt: ImageVector? = null
